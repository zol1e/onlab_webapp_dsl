package generator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

public class PythonClassGenerator {

	public Set<String> imports = new LinkedHashSet<String>();
	public String className;
	public String baseClassName;
	public Set<String> variables = new LinkedHashSet<String>();
	public List<PythonMethodGenerator> methods = new ArrayList<PythonMethodGenerator>();
	public List<String> endLines = new ArrayList<String>();
	
	private IFile file;
	private PrintWriter pw;
	private ByteArrayOutputStream stream;

	public PythonClassGenerator(IFile file) {
		this.file = file;
		stream = new ByteArrayOutputStream();
		pw = new PrintWriter(stream);
	}

	public void generateClassFile() {
		try {
			pw.println("#-*- coding: utf-8 -*-");

			for (String imp : imports) {
				pw.println(imp);
			}

			pw.println("");

			pw.print("class ");
			pw.print(className);
			pw.print("(");
			pw.print(baseClassName);
			pw.println("):");

			for (String variable : variables) {
				pw.print(PythonGeneratorUtility.INDENT);
				pw.println(variable);
			}

			for (PythonMethodGenerator method : methods) {
				pw.println("");
				method.flush(pw);
			}

			pw.println();
			
			for(String endLine : endLines) {
				pw.println(endLine);
			}
			
			pw.flush();
			file.create(new ByteArrayInputStream(stream.toByteArray()), true, null);
			pw.close();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
