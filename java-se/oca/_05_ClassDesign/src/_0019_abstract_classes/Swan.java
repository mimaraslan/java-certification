package _0019_abstract_classes;

public class Swan extends Animal {
	public String getName2() {
		return "Swan default";
	}
	
	public String getName3() {
		return "Swan protected";
	}
	
	public String getName4() {
		return "Swan public";
	}
	
	public static void main(String[] args) {
		Swan swan = new Swan();
		System.out.println(swan.getName2());
		System.out.println(swan.getName3());
		System.out.println(swan.getName4());
	}
}