package _0014_hiding_static_methods;

public class Panda extends Bear {

	public static void eat() {
		System.out.println("Panda bear is chewing");
	}

	public void sneeze() { // DOES NOT COMPILE
		System.out.println("Panda bear sneezes quietly");
	}

	public static void hibernate() { // DOES NOT COMPILE
		System.out.println("Panda bear is going to sleep");
	}

	public static void main(String[] args) {
		Panda.eat();
	}
}