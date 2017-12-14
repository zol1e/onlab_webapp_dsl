package generator;

import static generator.JinjaGeneratorUtility.MACRO_END;
import static generator.JinjaGeneratorUtility.genImport;
import static generator.JinjaGeneratorUtility.genMacro;
import static generator.JinjaGeneratorUtility.genVariable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;

import views.Block;
import views.BlockHolder;
import views.Navigation;
import views.Page;
import views.View;
import views.ViewBase;

public class ViewGenerator {

	public IProject project;

	public List<Page> pages;
	public List<views.List> lists;
	public List<View> views;
	public List<Block> customBlocks;
	public List<Navigation> navigations;

	public ViewGenerator(IProject project, ViewBase viewBae, List<Page> pages, List<views.List> lists, List<View> views,
			List<Block> customBlocks, List<Navigation> navigations) {
		this.project = project;
		this.pages = pages;
		this.lists = lists;
		this.views = views;
		this.customBlocks = customBlocks;
		this.navigations = navigations;
	}

	public void generateCode() {
		for (Page page : pages) {
			generatePage(page);
		}
		for (View view : views) {
			generateViewHtml(view, project, lists);
		}
		for (views.List list : lists) {
			generateListHtml(list, project);
			generateListModule(list, project);
		}
		for (Navigation navigation : navigations) {
			generateNavigationMacroHtml(navigation, project);
		}
		for (Block customBlock : customBlocks) {
			generateCustomBlockModule(customBlock, project);
			generateCustomBlockHtml(customBlock, project);
		}
		
		generateCustomBlocksModuleInit(customBlocks, project);
	}

	private static void generateCustomBlocksModuleInit(List<Block> blocks, IProject project) {
		IFile pythonCustomBlockInitFile = project.getFile("/modules/__init__.py");
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(stream);
		
		try {
			for(Block block : blocks) {
				genCustomBlockImport(pw, block);
			}
			
			pw.flush();
			pythonCustomBlockInitFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void genCustomBlockImport(PrintWriter pw, Block block) {
		pw.print("from ");
		pw.print("modules." + block.getName().toLowerCase());
		pw.print(" import ");
		pw.println(PythonGeneratorUtility.genClassName(block.getName()));
	}
	
	private static void generateCustomBlockHtml(Block block, IProject project) {
		IFile htmlCustomBlockFile = project.getFile("/html/" + block.getName().toLowerCase() + ".html");
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(stream);
		
		Set<String> defaultLoadContent = new HashSet<String>();
		List<BlockHolder> blockHolders = new ArrayList<BlockHolder>();
		List<Navigation> customNavigations = new ArrayList<Navigation>();
		for(EObject element : block.eContents()) {
			if(element instanceof BlockHolder) {
				BlockHolder blockHolder = (BlockHolder) element;
				blockHolders.add(blockHolder);
				if(blockHolder.getDefaultBlock() instanceof Navigation) {
					customNavigations.add((Navigation) blockHolder.getDefaultBlock());
				}
			}
		}
		
		for (Navigation navigation : customNavigations) {
			pw.println(genImport("macros/" + HtmlGenerator.getMacroHtmlFileName(navigation),
					navigation.getName().toLowerCase()));
		}
		
		try {
			pw.println(HtmlGeneratorUtility.genTag(block.getName(), "p"));
			HtmlGeneratorUtility.genDivTagWithId(pw, null, null, "container-fluid", 0);
			
			pw.println();
			
			boolean rowMode = block.getStyle() != null && block.getStyle().length() > 0 && block.getStyle().equals("row");
			if(rowMode) {
				HtmlGeneratorUtility.genDivTagWithId(pw, null, null, "row", 1);
				pw.println();
			}
			
			defaultLoadContent = HtmlGenerator.genBlockHolderHtmlCode(pw, blockHolders,  rowMode, (rowMode ? 2 : 1));
			
			if(rowMode) {
				pw.print(HtmlGeneratorUtility.INDENT);
				pw.println(HtmlGeneratorUtility.DIV_TAG_END);
			}
			
			// Fluid konténer lezárása
			pw.println(HtmlGeneratorUtility.DIV_TAG_END);
			
			HtmlGenerator.genDefaultContents(pw, defaultLoadContent, 0);
			
			pw.flush();
			htmlCustomBlockFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void generateListModule(views.List list, IProject project) {
		generateListModule(list.getName(), list.getView().getName(), list.getSkeletons().get(0).getName(), project, false);
	}
	
	public static void generateListModule(String listName, String viewName, String skeletonName, IProject project, boolean defaultTemplate) {
		IFile moduleClassFile = project.getFile("/modules/" + listName.toLowerCase() + ".py");
		PythonClassGenerator moduleClass = new PythonClassGenerator(moduleClassFile);

		moduleClass.imports.add("from server.prototypes import List");
		moduleClass.className = PythonGeneratorUtility.genClassName(listName);
		moduleClass.baseClassName = "List";

		if(!defaultTemplate) {
			StringBuilder viewVariable = new StringBuilder();
			viewVariable.append("viewTemplate = \"");
			viewVariable.append(viewName.toLowerCase());
			viewVariable.append("_view");
			viewVariable.append("\"");
	
			StringBuilder listVariable = new StringBuilder();
			listVariable.append("listTemplate = \"");
			listVariable.append(listName.toLowerCase());
			listVariable.append("_list");
			listVariable.append("\"");
			
			moduleClass.variables.add(viewVariable.toString());
			moduleClass.variables.add(listVariable.toString());
		}

		StringBuilder kindVariable = new StringBuilder();
		kindVariable.append("kindName = \"");
		kindVariable.append(skeletonName.toLowerCase());
		kindVariable.append("\"");
		
		moduleClass.variables.add(kindVariable.toString());

		PythonMethodGenerator listFilterMethod = new PythonMethodGenerator();
		listFilterMethod.methodName = "listFilter";
		listFilterMethod.returnValue = "filter";
		listFilterMethod.parameters.add("self");
		listFilterMethod.parameters.add("filter");
		listFilterMethod.indentation = 0;
		
		moduleClass.methods.add(listFilterMethod);

		moduleClass.generateClassFile();
	}
	
	private static void generateCustomBlockModule(Block customBlock, IProject project) {
		IFile pythonCustomBlockFile = project.getFile("/modules/" + customBlock.getName().toLowerCase() + ".py");
		PythonClassGenerator moduleClass = new PythonClassGenerator(pythonCustomBlockFile);
		String className = PythonGeneratorUtility.genClassName(customBlock.getName());

		moduleClass.imports.add("from server import errors, exposed");
		moduleClass.className = className;
		moduleClass.baseClassName = "object";

		PythonMethodGenerator initMethodGenerator = new PythonMethodGenerator();
		initMethodGenerator.methodName = "__init__";
		initMethodGenerator.parameters.add("self");
		initMethodGenerator.parameters.add("*args");
		initMethodGenerator.parameters.add("**kwargs");
		initMethodGenerator.indentation = 1;

		initMethodGenerator.body.add("super( " + className + ", self ).__init__()");
		initMethodGenerator.body.add("self.modulePath = \"\"");

		PythonMethodGenerator indexMethodGenerator = new PythonMethodGenerator();
		indexMethodGenerator.methodName = "index";
		indexMethodGenerator.annotation = "@exposed";
		indexMethodGenerator.parameters.add("self");
		indexMethodGenerator.parameters.add("template=\"" + customBlock.getName().toLowerCase() + "\"");
		indexMethodGenerator.parameters.add("*args");
		indexMethodGenerator.parameters.add("**kwargs");
		indexMethodGenerator.returnValue = "template.render()";
		indexMethodGenerator.indentation = 1;

		indexMethodGenerator.body.add("if \"..\" in template or \"/\" in template:");
		indexMethodGenerator.body.add(PythonGeneratorUtility.genIndent(1) + "return");
		indexMethodGenerator.body.add("try:");
		indexMethodGenerator.body.add(PythonGeneratorUtility.genIndent(1) + "template = self.render.getEnv().get_template( self.render.getTemplateFileName( template ) )");
		indexMethodGenerator.body.add("except:");
		indexMethodGenerator.body.add(PythonGeneratorUtility.genIndent(1) + "raise errors.NotFound()");
		
		moduleClass.methods.add(initMethodGenerator);
		moduleClass.methods.add(indexMethodGenerator);
		
		moduleClass.endLines.add(className + ".html = True");
		
		moduleClass.generateClassFile();
	}

	private void generatePage(Page page) {
		IFile htmlBaseFile = project.getFile("/html/" + page.getName().toLowerCase() + ".html");
		IFile htmlIndexFile = project.getFile("/html/index.html");
		HtmlGenerator htmlGenerator = new HtmlGenerator(htmlBaseFile, htmlIndexFile, page);

		htmlGenerator.headCodes.add(HtmlGeneratorUtility.META_TAG_UTF8);
		htmlGenerator.headCodes.add(HtmlGeneratorUtility.BOOTSTRAP_CSS);
		htmlGenerator.headCodes.add(HtmlGeneratorUtility.genTitleTag(page.getName()));

		htmlGenerator.bodyCodes.add(HtmlGeneratorUtility.genHeaderTag("Page name: " + page.getName(), 1));

		for (BlockHolder block : page.getBlockHolders()) {
			htmlGenerator.blockHolders.add(block);
		}

		for (Navigation navigation : navigations) {
			htmlGenerator.macroImports.add(genImport("macros/" + HtmlGenerator.getMacroHtmlFileName(navigation),
					navigation.getName().toLowerCase()));
		}

		htmlGenerator.scripts.add(new HtmlScriptTag("/static/js/jquery-3.2.1.min.js", null, 1));
		htmlGenerator.scripts.add(new HtmlScriptTag("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js", null, 1));
		htmlGenerator.scripts.add(new HtmlScriptTag("/static/js/app.js", null, 1));

		//htmlGenerator.generateBaseHtmlFile();
		htmlGenerator.generateIndexPage();
	}

	public static void generateNavigationMacroHtml(Navigation navigation, IProject project) {
		IFile htmlNavigationFile = project.getFile("/html/" + HtmlGenerator.getMacroHtmlFileName(navigation));
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(stream);
		try {
			genMacro(pw, navigation.getName(), Arrays.asList("target"));

			pw.println();

			HtmlGenerator.generateNavigation(pw, navigation, genVariable("target"));

			pw.println(MACRO_END);
			pw.flush();
			htmlNavigationFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generateViewHtml(View view, IProject project, List<views.List> lists) {
		try {
			IFile htmlFile = project.getFile("/html/" + view.getName().toLowerCase() + "_view.html");
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintWriter pw = new PrintWriter(stream);

			HtmlGenerator.generateView(pw, view, null, null, lists);

			pw.flush();
			htmlFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void generateListHtml(views.List list, IProject project) {
		try {
			IFile htmlFile = project.getFile("/html/" + list.getName().toLowerCase() + "_list.html");
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			PrintWriter pw = new PrintWriter(stream);

			HtmlGenerator.generateList(pw, list, null, null, list.getStyle());

			pw.flush();
			htmlFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
