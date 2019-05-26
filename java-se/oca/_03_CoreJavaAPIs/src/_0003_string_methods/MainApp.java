package _0003_string_methods;

class MainApp {

	public static void main(String[] args) {

		// 0 1 2 3 4 5 6
		// a n i m a l s

		String string = "animals";

		System.out.println("length");
		System.out.println(string.length()); // 7

		System.out.println("\n  charAt");
		System.out.println(string.charAt(0)); // a
		System.out.println(string.charAt(6)); // s
		// System.out.println(string.charAt(7)); // throws exception

		System.out.println("\n indexOf");
		System.out.println(string.indexOf('a')); // 0
		System.out.println(string.indexOf("al")); // 4
		System.out.println(string.indexOf('a', 4)); // 4
		System.out.println(string.indexOf("al", 5)); // -1

		System.out.println("\n substring");
		System.out.println(string.substring(3)); // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 3)); // empty string
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals
		// System.out.println(string.substring(3, 2)); // throws exception
		// System.out.println(string.substring(3, 8)); // throws exception

		System.out.println("\n toUpperCase");
		System.out.println(string.toUpperCase()); // ANIMALS

		System.out.println("\n toLowerCase");
		System.out.println("Abc123".toLowerCase()); // abc123

		System.out.println("\n equals");
		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true

		System.out.println("\n equalsIgnoreCase");
		System.out.println("abc".equalsIgnoreCase("ABC")); // true

		System.out.println("\n startsWith");
		System.out.println("abc".startsWith("a")); // true
		System.out.println("abc".startsWith("A")); // false

		System.out.println("\n endsWith");
		System.out.println("abc".endsWith("c")); // true
		System.out.println("abc".endsWith("a")); // false

		System.out.println("\n contains");
		System.out.println("abc".contains("b")); // true
		System.out.println("abc".contains("B")); // false

		System.out.println("\n replace");
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc
		System.out.println("abcabc".replace("a", "A")); // AbcAbc

		System.out.println("\n trim");
		System.out.println("abc".trim()); // abc
		System.out.println("\t a b c\n".trim()); // a b c

	}

}