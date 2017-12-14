package generator;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PythonMethodGenerator {
	
	public String methodName;
	
	public List<String> parameters = new ArrayList<String>();
	
	public List<String> body = new ArrayList<String>();
	
	public String annotation;
	
	public String returnValue;

	int indentation;
	
	public PythonMethodGenerator() {
		
	}
	
	public void flush(PrintWriter pw) {
		if(pw == null) {
			return;
		}
		
		if(annotation != null && annotation.length() > 0) {
			pw.print(PythonGeneratorUtility.genIndent(indentation));
			pw.println(annotation);
		}
		
		pw.print(PythonGeneratorUtility.genIndent(indentation));
		pw.print("def ");
		pw.print(methodName);
		pw.print("(");
		
		Iterator<String> iterator = parameters.iterator();
		while(iterator.hasNext()) {
			String parameter = iterator.next();
			
			pw.print(parameter);
			
			if(iterator.hasNext()) {
				pw.print(", ");
			}
		}
		
		pw.println("):");
		
		for(String bodyLine : body) {
			pw.print(PythonGeneratorUtility.genIndent(indentation + 1));
			pw.println(bodyLine);
		}
		
		if(returnValue != null) {
			pw.print(PythonGeneratorUtility.genIndent(indentation + 1));
			pw.print("return ");
			pw.print(returnValue);
		}
	}
	
}
