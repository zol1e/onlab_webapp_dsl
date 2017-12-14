package generator;

public class PythonGeneratorUtility {
	public static final String INDENT = "    ";
	
	public static String genClassName(String name) {
		return name = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
	}
	
	public static String genIndent(int count) {
		StringBuilder indents = new StringBuilder();
		for(int i = 0; i < count; i++) {
			indents.append(INDENT);
		}
		return indents.toString();
	}
}
