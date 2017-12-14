package cms_model_v1.editor.handlers;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import entities.EntitiesFactory;
import entities.EntitiesPackage;
import views.ViewsPackage;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		ISelectionService service = window.getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service
				.getSelection("org.eclipse.jdt.ui.PackageExplorer");

		Object selectedObject = structured.getFirstElement();
		
		if (selectedObject instanceof File) {
			File file = (File) selectedObject;
	        // Initialize the model
	        ViewsPackage.eINSTANCE.eClass();

	        // Register the XMI resource factory for the .website extension

	        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	        Map<String, Object> m = reg.getExtensionToFactoryMap();
	        m.put("entities", new XMIResourceFactoryImpl());

	        // Obtain a new resource set
	        ResourceSet resSet = new ResourceSetImpl();

	        // Get the resource
	        Resource resource = resSet.getResource(URI
	                .createURI("website/My.website"), true);
	        // Get the first model element and cast it to the right type, in my
	        // example everything is hierarchical included in this first node
	        //Views myWeb = (Views) resource.getContents().get(0);
	        //return myWeb;
	        
	        
	        
		}

		MessageDialog.openInformation(window.getShell(), "Cms_v1 Editor", "Hello, Eclipse world");

		return null;
	}
}
