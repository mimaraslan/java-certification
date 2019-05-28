package _0014_static_variable_fields;

public class KoalaTester { 
	public static void main(String[] args) {
		System.out.println(Koala.count);
		Koala.main(new String[0]); //10  call static method

		Koala k = new Koala();
		System.out.println(k.count); // 10 k is a Koala
		
		k = null;
		System.out.println(k); // null

		System.out.println(k.count); // 10 k is still a Koala 

		Koala.count = 4;
		Koala koala1 = new Koala();
		Koala koala2 = new Koala();
		koala2.count = 5;
		koala1.count = 6;
		System.out.println(k.count); // 6
		System.out.println(koala1.count); // 6
		System.out.println(koala2.count); // 6
		System.out.println(Koala.count); // 6

		k.count = 7;
		System.out.println(k.count); // 7
		System.out.println(koala1.count); // 7
		System.out.println(koala2.count); // 7
		System.out.println(Koala.count); // 7
	}
}