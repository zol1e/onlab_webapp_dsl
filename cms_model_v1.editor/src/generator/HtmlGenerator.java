package generator;

import static generator.HtmlGeneratorUtility.DIV_TAG_END;
import static generator.HtmlGeneratorUtility.genDivTagWithId;
import static generator.HtmlGeneratorUtility.genIndent;
import static generator.JinjaGeneratorUtility.genSetVariable;
import static generator.JinjaGeneratorUtility.genVariable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;

import entities.Bone;
import entities.Connection;
import views.Block;
import views.BlockHolder;
import views.Navigation;
import views.Page;
import views.View;

public class HtmlGenerator {
	private IFile baseFile;

	private IFile indexFile;

	public List<String> headCodes = new ArrayList<String>();

	public List<String> bodyCodes = new ArrayList<String>();

	public List<HtmlScriptTag> scripts = new ArrayList<HtmlScriptTag>();

	public List<BlockHolder> blockHolders = new ArrayList<BlockHolder>();

	public Set<String> macroImports = new HashSet<String>();

	public Set<String> defaultLoadContent = new HashSet<String>();

	public Page page;

	public HtmlGenerator(IFile baseFile, IFile indexFile, Page page) {
		this.baseFile = baseFile;
		this.indexFile = indexFile;
		this.page = page;
	}

	// Default lapok generálásához
	public void generateIndexPage() {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(stream);
		try {
			Iterator<String> iterator = macroImports.iterator();
			while (iterator.hasNext()) {
				pw.println(iterator.next());
			}

			pw.println("<html>");
			pw.println();

			pw.println("<head>");
			for (String headCode : headCodes) {
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println(headCode);
				pw.println();
			}
			pw.println("</head>");
			pw.println();

			pw.println("<body>");
			for (String bodyCode : bodyCodes) {
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println(bodyCode);
			}

			// Egyenlõre egy lap van, azt kell kiterjeszteni, késõbb a megadott lapot
			// genBlockExtendation(pw, page.getName().toLowerCase() + ".html", null);

			defaultLoadContent = genBlockHolderHtmlCode(pw, blockHolders, false, 1);

			pw.println();
			for (HtmlScriptTag scriptTag : scripts) {
				scriptTag.genTag(pw);
			}

			genDefaultContents(pw, defaultLoadContent, 1);

			pw.println("</body>");

			pw.println("</html>");

			pw.flush();
			indexFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Set<String> genBlockHolderHtmlCode(PrintWriter pw, List<BlockHolder> blockHolders, boolean rowMode,
			int indent) {
		Set<String> defaultLoadContent = new HashSet<String>();
		for (BlockHolder blockHolder : blockHolders) {
			String navigationTargetHolder = blockHolder.getNavigationTarget().getName().toLowerCase() + "_holder";
			String blockHolderId = blockHolder.getName().toLowerCase() + "_holder";
			String blockHolderStyle = blockHolder.getStyle();

			if (rowMode) {
				genDivTagWithId(pw, blockHolderId, navigationTargetHolder, blockHolderStyle, indent);
			} else {
				genDivTagWithId(pw, blockHolderId, navigationTargetHolder, null, indent);
			}
			pw.println();

			Block block = blockHolder.getDefaultBlock();
			if (block instanceof View) {
				// View view = (View) block;
			} else if (block instanceof views.List) {
				views.List list = (views.List) block;
				defaultLoadContent.add("loadContent('/" + list.getName().toLowerCase()
						+ "/list', '" + blockHolderId + "');");
			} else if (block instanceof Navigation) {
				Navigation navigation = (Navigation) block;
				pw.print(genIndent(indent + 1));
				generateNavigationMacroCall(pw, navigation, blockHolder.getNavigationTarget().getName().toLowerCase());
			} else if (block instanceof Block) {
				defaultLoadContent
						.add("loadContent('/" + block.getName().toLowerCase() + "', '" + blockHolderId + "');");
			}

			pw.print(genIndent(indent));
			pw.println(DIV_TAG_END);
			pw.println();
		}
		return defaultLoadContent;
	}

	public static void genDefaultContents(PrintWriter pw, Set<String> defaultLoadContent, int indent) {
		StringBuilder scriptBuilder = new StringBuilder();

		scriptBuilder.append(HtmlGeneratorUtility.genIndent(2));
		scriptBuilder.append("$(document).ready(function() {\n");

		Iterator<String> defaults = defaultLoadContent.iterator();
		while (defaults.hasNext()) {
			scriptBuilder.append(HtmlGeneratorUtility.genIndent(3));
			scriptBuilder.append(defaults.next() + "\n");
		}

		scriptBuilder.append(HtmlGeneratorUtility.genIndent(2));
		scriptBuilder.append("})");

		HtmlScriptTag script = new HtmlScriptTag(null, scriptBuilder, indent);
		script.genTag(pw);
	}

	public void generateBaseHtmlFile() {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		PrintWriter pw = new PrintWriter(stream);
		try {
			pw.println("<html>");
			pw.println();

			pw.println("<head>");
			for (String headCode : headCodes) {
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println(headCode);
				pw.println();
			}
			pw.println("</head>");
			pw.println();

			pw.println("<body>");
			for (String bodyCode : bodyCodes) {
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println(bodyCode);
			}

			for (BlockHolder blockHolder : blockHolders) {
				HtmlGeneratorUtility.genIndent(pw, 1);
				JinjaGeneratorUtility.genBlock(pw, blockHolder.getName().toLowerCase());
				pw.println();
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println(JinjaGeneratorUtility.BLOCK_END);
				pw.println();
			}

			pw.println();
			for (HtmlScriptTag scriptTag : scripts) {
				scriptTag.genTag(pw);
			}

			pw.println("</body>");

			pw.println("</html>");

			pw.flush();
			baseFile.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Egy Skeleton példányhoz tartozó html részlet generálása.
	 * 
	 * @param pw
	 * @param view
	 * @param extendedHtmlFileName
	 * @param extendedBlockName
	 */
	public static void generateView(PrintWriter pw, View view, String extendedHtmlFileName, String extendedBlockName, List<views.List> lists) {

		genSetVariable(pw, "uniqueId", "range(1, 1000) | random");

		pw.println();

		pw.print("<h1>");
		JinjaGeneratorUtility.genVarReference(pw, "skel", "name");
		pw.println("</h1>");

		EList<Bone> bones = (view.getViewBones().size() > 0 ? view.getViewBones() : view.getSkeleton().getBones());
		for (Bone bone : bones) {
			pw.print("<strong>" + bone.getName() + ": </strong>");
			JinjaGeneratorUtility.genVarReference(pw, "skel", bone.getName().toLowerCase());
			pw.println("<br>");
		}

		EList<Connection> connections = (view.getViewConnections().size() > 0 ? view.getViewConnections()
				: view.getSkeleton().getConnections());
		for (Connection connection : connections) {
			views.List listForReferedSkel = null;
			for(views.List oneList : lists) {
				if(oneList.getSkeletons().get(0).equals(connection.getRefered())) {
					listForReferedSkel = oneList;
					break;
				}
			}
			
			if(listForReferedSkel != null) {
				String referedNameLowerCase = listForReferedSkel.getName().toLowerCase();
				pw.print("<strong>");
				pw.println(connection.getName());
	
				pw.println("<ul id=\"{{uniqueId}}\">");
	
				JinjaGeneratorUtility.genFor(pw, referedNameLowerCase, "skel." + connection.getName().toLowerCase());
				pw.println();
	
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println("<li>");
				HtmlGeneratorUtility.genIndent(pw, 2);
				pw.println("<a onclick=\"loadPart(\'/" + referedNameLowerCase + "/view/{{" + referedNameLowerCase
						+ ".key}}\',\'{{uniqueId}}\')\"> {{" + referedNameLowerCase + ".name}} </a>");
	
				HtmlGeneratorUtility.genIndent(pw, 1);
				pw.println("</li>");
	
				pw.print(JinjaGeneratorUtility.FOR_END);
				pw.println();
	
				pw.println("</ul>");
	
				pw.println("</strong>");
			}
		}

		pw.print("<strong>Created at: </strong>");
		JinjaGeneratorUtility.genVarReference(pw, "skel", "creationdate.strftime(\"%Y-%m-%d %H:%M\")");
		pw.println("<br>");

		pw.print("<strong>Modified at: </strong>");
		JinjaGeneratorUtility.genVarReference(pw, "skel", "changedate.strftime(\"%Y-%m-%d %H:%M\")");
		pw.println("<br>");
	}

	public static void generateList(PrintWriter pw, views.List list, String extendedHtmlFileName,
			String extendedBlockName, String style) {

		genSetVariable(pw, "uniqueId", "range(1, 1000) | random");

		pw.println();

		pw.print("<p>");
		pw.print(list.getName());
		pw.println("</p>");

		pw.print("<ul id=\"{{uniqueId}}\"");
		if(style != null && style.length() > 0) {
			pw.print(" class=\"" + style + "\"");
		}
		pw.println(">");
		
		HtmlGeneratorUtility.genIndent(pw, 1);
		JinjaGeneratorUtility.genFor(pw, "skel", "skellist");
		pw.println();
		HtmlGeneratorUtility.genIndent(pw, 1);
		pw.println("<li>");

		HtmlGeneratorUtility.genIndent(pw, 2);
		pw.print("<a onclick=\"loadPart(\'/" + list.getName().toLowerCase()
				+ "/view/{{skel.key}}\', {{uniqueId}})\">");

		if(list.getListBones().size() > 0) {
			for (Bone bone : list.getListBones()) {
				pw.print(" {{skel." + bone.getName().toLowerCase() + "}} ");
			}
		} else {
			pw.print(" {{skel.name}} ");
		}

		pw.println("</a>");

		HtmlGeneratorUtility.genIndent(pw, 1);
		pw.println("</li>");
		HtmlGeneratorUtility.genIndent(pw, 1);
		pw.println(JinjaGeneratorUtility.FOR_END);

		pw.println("</ul>");
	}

	private static void genBlockExtendation(PrintWriter pw, String extendedHtmlFileName, String extendedBlockName) {
		if (extendedHtmlFileName != null && !extendedHtmlFileName.isEmpty()) {
			JinjaGeneratorUtility.genBlockExtend(pw, extendedHtmlFileName);
			pw.println();
		}
		if (extendedBlockName != null && !extendedBlockName.isEmpty()) {
			JinjaGeneratorUtility.genBlock(pw, extendedBlockName);
			pw.println();
		}
	}

	public static void generateNavigation(PrintWriter pw, Navigation navigation, String navigationTarget) {
		HtmlGeneratorUtility.genIndent(pw, 1);

		if (navigation.getStyle() != null && navigation.getStyle().length() > 0) {
			pw.println("<ul class=\"" + navigation.getStyle() + "\">");
		} else {
			pw.println("<ul>");
		}

		for (Block block : navigation.getBlockNavigationItems()) {
			HtmlGeneratorUtility.genIndent(pw, 2);
			pw.print("<li>");
			if (block instanceof views.List) {
				// Listához a linket kell generálni, url triviális,
				views.List list = (views.List) block;
				String listNameLowercase = list.getName().toLowerCase();
				pw.print("<a onclick=\"loadContent(\'/" + listNameLowercase + "/list\', \'" + navigationTarget
						+ "\')\">" + list.getName() + "</a>");
			} else {
				// Itt custom blockot generálunk, mert egy generikus blockról van szó
				pw.print("<a onclick=\"loadContent(\'/" + block.getName().toLowerCase() + "\', \'" + navigationTarget
						+ "\')\">" + block.getName() + "</a>");
			}
			pw.println("</li>");
		}

		HtmlGeneratorUtility.genIndent(pw, 1);
		pw.println("</ul>");
	}

	public static void generateNavigationMacroCall(PrintWriter pw, Navigation navigation, String navigationTarget) {
		// pl.: {{ menu1.menu1('content_holder') }}
		pw.println(genVariable(navigation.getName().toLowerCase() + "." + navigation.getName().toLowerCase() + "(\'"
				+ navigationTarget + "_holder" + "\')"));
	}

	public static String getMacroHtmlFileName(Navigation navigation) {
		return navigation.getName().toLowerCase() + "_macro.html";
	}
}
