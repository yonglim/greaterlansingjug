package org.gljug;

public class Tst01StringBuilder {
	public static void main(String[] args) {
		
		// why use this 
		// less overhead, fast code ... only if not dealing with multi threads
		StringBuilder sb = new StringBuilder();
		sb.append("StringBuilder is");
		sb.append(" ");
		sb.append("the same");
		sb.append(" ");
		sb.append("as StringBuffer");
		sb.append(" ");
		sb.append("\nbut without");
		sb.append(" ");
		sb.append("the synchronization");
		sb.append(" ");
		sb.append(",\nso better performance??\n");
		
		System.out.println(sb.toString());
		
		
		// Formatter
		// file:///home/yonghow/files/docs/greaterlansingjug/tigerAndBeyond/javadocs/api/java/util/Formatter.html

	}

}
