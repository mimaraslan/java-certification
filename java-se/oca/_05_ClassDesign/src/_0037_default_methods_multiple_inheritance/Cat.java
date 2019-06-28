package _0037_default_methods_multiple_inheritance;

public class Cat implements Run, Walk { // DOES NOT COMPILE

	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}