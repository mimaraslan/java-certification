package _0007_RuntimeException_try_catch;

public class MainApp {

	void explore() {
		System.out.println("explore");

		try {
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			getUp();
		}
		seeAnimals();
	}

	private void getUp() {
		System.out.println("getUp");
	}

	private void seeAnimals() {
		System.out.println("seeAnimals");
	}

	void fall() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.explore();
	}
}