package generator;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class JinjaGeneratorUtility {
	
	public static final String INDENT = "    ";
	
	public static final String BLOCK_END = "{% endblock %}";
	
	public static final String FOR_END = "{% endfor %}";
	
	public static final String MACRO_END = "{%- endmacro %}";
	
	public static void genBlock(PrintWriter pw, String blockName) {
		pw.print("{% block ");
		pw.print(blockName);
		pw.print(" %}");
	}
	
	public static void genFor(PrintWriter pw, String variable, String collection) {
		pw.print("{% for ");
		pw.print(variable);
		pw.print(" in ");
		pw.print(collection);
		pw.print(" %}");
	}
	
	public static void genSetVariable(PrintWriter pw, String name, String value) {
		pw.print("{% set ");
		pw.print(name);
		pw.print(" = ");
		pw.print(value);
		pw.print(" %}");
	}
	
	public static String genVariable(String variable) {
		StringBuilder builder = new StringBuilder();
		builder.append("{{ ");
		builder.append(variable);
		builder.append(" }}");
		return builder.toString();
	}
	
	public static void genVarReference(PrintWriter pw, String variable, String property) {
		pw.print("{{");
		pw.print(variable);
		pw.print(".");
		pw.print(property);
		pw.print("}}");
	}
	
	public static void genBlockExtend(PrintWriter pw, String htmlFileName) {
		pw.print("{% extends \"");
		pw.print(htmlFileName);
		pw.print("\" %}");
	}
	
	public static void genMacro(PrintWriter pw, String name, List<String> parameters) {
		pw.print("{% macro ");
		pw.print(name);
		pw.print("(");
		
		Iterator<String> iterator = parameters.iterator();
		while(iterator.hasNext()) {
			pw.print(iterator.next());
			if(iterator.hasNext()) {
				pw.print(", ");
			} else {
				pw.print(")");
			}
		}
		
		pw.print(" -%}");
	}
	
	public static String genImport(String path, String name) {
		StringBuilder builder = new StringBuilder();
		
		builder.append("{% import");
		builder.append(" \'");
		builder.append(path);
		builder.append("\' as ");
		builder.append(name);
		builder.append(" %}");
		
		return builder.toString();
	}
	
}
