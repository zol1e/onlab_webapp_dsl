package cms_model_v1.editor.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import entities.EntityBase;
import generator.CodeGenerator;
import views.ViewBase;

public class GenerateCodeHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {	
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		
		TreeSelection treeSelection = (TreeSelection) selection;
		
		Object selectedObject = treeSelection.getFirstElement();
		
		if(selectedObject instanceof EntityBase) {
			EntityBase entityBase = ( EntityBase) selectedObject;
			CodeGenerator generator = new CodeGenerator();
			
			for(IProject project : root.getProjects()) {
				if(project.getName().equals(generator.projectName)) {
					generator.project = project;
				}
			}
			
			generator.startEntityCodeGenerator(entityBase);
		}
		
		if(selectedObject instanceof ViewBase) {
			ViewBase viewBase = (ViewBase) selectedObject;
			CodeGenerator generator = new CodeGenerator();
			
			for(IProject project : root.getProjects()) {
				if(project.getName().equals(generator.projectName)) {
					generator.project = project;
				}
			}
			
			generator.startViewCodeGenerator(viewBase);
		}
		
		return null;
	}
}
