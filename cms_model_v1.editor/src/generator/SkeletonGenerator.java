package generator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

import entities.Bone;
import entities.Connection;
import entities.DataType;
import entities.Skeleton;

public class SkeletonGenerator {

	public IProject project;

	public void generateSkeletonCodes(Skeleton skeleton, IProject project) {
		generateSkeletonClass(skeleton, project);
		ViewGenerator.generateListModule(skeleton.getName(), null, skeleton.getName(), project, true);
	}

	private void generateSkeletonClass(Skeleton skeleton, IProject project) {
		IFile skeletonClassFile = project.getFile("/skeletons/" + skeleton.getName().toLowerCase() + ".py");
		PythonClassGenerator skeletonClass = new PythonClassGenerator(skeletonClassFile);

		skeletonClass.imports.add("from server.skeleton import Skeleton");
		skeletonClass.imports.add("from server.bones import *");
		skeletonClass.className = skeleton.getName() + "Skel";
		skeletonClass.baseClassName = "Skeleton";

		for (Bone bone : skeleton.getBones()) {
			StringBuilder boneDef = new StringBuilder();

			boneDef.append(bone.getName().toLowerCase())
			       .append(" = ")
				   .append(bone.getDatatype().getName().toLowerCase())
				   .append("Bone")
				   .append(SkeletonGenerator.getBoneProperties(bone));

			skeletonClass.variables.add(boneDef.toString());
		}

		for (Connection connection : skeleton.getConnections()) {
			StringBuilder connectionDef = new StringBuilder();

			connectionDef.append(connection.getName().toLowerCase())
			             .append(" = ")
			             .append("relationalBone")
					     .append("(kind=\"")
					     .append(connection.getRefered().getName().toLowerCase())
					     .append("\", ")
					     .append("descr=\"" + connection.getName() + "\"")
					     .append(", ")
					     .append("multiple=True, required=True)");
			
			skeletonClass.variables.add(connectionDef.toString());
		}

		skeletonClass.generateClassFile();
	}
	
	/**
	 * Beégetések az egyes datatypeokhoz. TODO: ennek kezelését a model propertyben
	 * megadni.
	 */
	public static String getBoneProperties(Bone bone) {
		DataType dataType = bone.getDatatype();
		if (dataType.getName().equals("String")) {
			return "(descr=\"" + bone.getName() + "\")";
		}
		if (dataType.getName().equals("Numeric")) {
			return "(descr=\"" + bone.getName() + "\")";
		}
		if(dataType.getName().equals("Text") ) {
			return "(descr=\"" + bone.getName() + "\")";
		}
		return "()";
	}

}
