package generator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import entities.EntityBase;
import entities.Skeleton;
import views.Block;
import views.Navigation;
import views.Page;
import views.View;
import views.ViewBase;

public class CodeGenerator {

	public String projectName = "test-generated";
	public IProject project;
	
	public void startEntityCodeGenerator(EntityBase base) {
		SkeletonGenerator skeletonGenerator = new SkeletonGenerator();
		
		EObject object = EcoreUtil.getRootContainer(base);
		
		Set<Skeleton> skeletons = new HashSet<Skeleton>();
		
		for(EObject element : object.eContents()) {
			if(element instanceof Skeleton) {
				skeletons.add((Skeleton) element);
			}
		}
		
		Iterator<Skeleton> iterator = skeletons.iterator();
		while(iterator.hasNext()) {
			skeletonGenerator.generateSkeletonCodes(iterator.next(), project);
		}
	}
	
	public void startViewCodeGenerator(ViewBase base) {		
		List<Page> pages = new ArrayList<Page>();
		List<views.List> lists = new ArrayList<views.List>();
		List<View> views = new ArrayList<View>();
		List<Block> customBlocks = new ArrayList<Block>();
		List<Navigation> navigations = new ArrayList<Navigation>();
		
		for(EObject element : base.eContents()) {
			if(element instanceof Page) {
				pages.add((Page) element);
			} else if(element instanceof views.List) {
				lists.add((views.List) element);
			} else if(element instanceof View) {
				views.add((View) element);
			} else if(element instanceof Navigation) {
				navigations.add((Navigation) element);
			} else if(element instanceof Block) {
				customBlocks.add((Block) element);
			}
		}
		
		ViewGenerator viewGenerator = new ViewGenerator(project, base, pages, lists, views, customBlocks, navigations);

		viewGenerator.generateCode();
	}
	
}
