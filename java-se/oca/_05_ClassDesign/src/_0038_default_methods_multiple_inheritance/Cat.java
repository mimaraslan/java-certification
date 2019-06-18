package _0038_default_methods_multiple_inheritance;

public class Cat implements Run, Walk {

//	public int getSpeed() {
//		return 3;
//	}

	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
}