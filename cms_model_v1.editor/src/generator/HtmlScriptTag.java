package generator;

import java.io.PrintWriter;

public class HtmlScriptTag {

	public String src;
	
	public StringBuilder code;
	
	int indent;
	
	public HtmlScriptTag(String src, StringBuilder code, int indent) {
		this.src = src;
		this.code = code;
		this.indent = indent;
	}
	
	public void genTag(PrintWriter pw) {
		pw.print(HtmlGeneratorUtility.genIndent(indent));
		pw.print("<script");
		
		if(src != null && !src.isEmpty()) {
			pw.print(" src=\""+ src +"\"");
		}
		
		pw.print(">");
		
		if(code != null) {
			pw.println();
			pw.print(code.toString());
			pw.println();
			pw.print(HtmlGeneratorUtility.genIndent(indent));
		}

		pw.println("</script>");
	}
	
}
