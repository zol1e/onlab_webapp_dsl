package generator;

import java.io.PrintWriter;

public class HtmlGeneratorUtility {
	
	public static final String META_TAG_UTF8 = "<meta charset=\"utf-8\">";
	
	public static final String INDENT = "    ";
	
	public static final String DIV_TAG_END = "</div>";
	
	public static final String BOOTSTRAP_CSS = "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">";
	
	public static final String BOOSTRAP_JS_SRC = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js";
	
	public static String genTitleTag(String title) {
		StringBuilder titleBuilder = new StringBuilder();
		titleBuilder.append("<title>");
		titleBuilder.append(title);
		titleBuilder.append("</title>");
		
		return titleBuilder.toString();
	}
	
	public static void genDivTagWithId(PrintWriter pw, String id, String target, String style, int indent) {
		for(int i = 0; i < indent; i++) {
			pw.print(INDENT);
		}
		pw.print("<div");
		if(style != null) {
			pw.print(" class=\"" + style + "\"");
		}
		if(id != null) {
			pw.print(" id=\"" + id + "\"");
		}
		if(target != null) {
			pw.print(" target=\"" + target + "\"");
		}
		pw.print(">");
	}
	
	public static String genHeaderTag(String text, int deep) {
		StringBuilder headerBuilder = new StringBuilder();
		headerBuilder.append("<h" + deep + ">");
		headerBuilder.append(text);
		headerBuilder.append("</h" + deep + ">");
		
		return headerBuilder.toString();
	}
	
	public static String genTag(String text, String htmlTag) {
		StringBuilder headerBuilder = new StringBuilder();
		headerBuilder.append("<" + htmlTag + ">");
		headerBuilder.append(text);
		headerBuilder.append("</" + htmlTag + ">");
		
		return headerBuilder.toString();
	}
	
	public static void genIndent(PrintWriter pw, int count) {
		for(int i = 0; i < count; i++) {
			pw.print(INDENT);
		}
	}
	
	public static String genIndent(int count) {
		StringBuilder indents = new StringBuilder();
		for(int i = 0; i < count; i++) {
			indents.append(INDENT);
		}
		return indents.toString();
	}
	
}
