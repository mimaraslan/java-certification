package _0003_string_methods;

public class MainApp2 {

	public static void main(String[] args) {

		String start = "AniMaL ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal"
		String result = lowercase.replace('a', 'A'); // "AnimAl"
		System.out.println(result);

		String result2 = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result2);

		String a = "abc";
		String b = a.toUpperCase();
		b = b.replace("B", "2").replace('C', '3');
		System.out.println("a=" + a); // a=abc
		System.out.println("b=" + b); // b=A23
	}
}