package _0004_stringbuilder;

public class MainApp3 {

	public static void main(String[] args) {

		System.out.println("charAt(), indexOf(), length(), substring()");
		StringBuilder sb = new StringBuilder("animals");
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); 
		int len = sb.length();
		char ch = sb.charAt(6);
		System.out.println(sub + " " + len + " " + ch);
			
		System.out.println("\n append, toString");
		StringBuilder sb2 = new StringBuilder().append(1).append('c'); sb.append("-").append(true).toString();
		System.out.println(sb2); // 1c-true
		
		System.out.println("\n insert");		
		StringBuilder sb3 = new StringBuilder("animals");
		sb3.insert(7, "-");
		sb3.insert(0, "-");
		sb3.insert(4, "-");
		System.out.println(sb3);

		System.out.println("\n delete");    
		StringBuilder sb4 = new StringBuilder("abcdef");
		sb4.delete(1, 3); 
		System.out.println(sb4); // adef 
		
		System.out.println("\n deleteCharAt");    
		sb4.deleteCharAt(0); // a
		System.out.println(sb4); // def
	 // sb4.deleteCharAt(5); // throws an exception

		System.out.println("\n reverse");    
		StringBuilder sb5 = new StringBuilder("ABC"); 
		sb5.reverse();
		System.out.println(sb5);		
		
		System.out.println("\n toString");    
		String s = sb.toString();
		System.out.println(s);		
	}
}