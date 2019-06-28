package _0008_RuntimeException_try_catch_finally;

public class MainApp {

	void explore() {
		System.out.println("explore");

		try {
			seeAnimals();
			fall();
			System.out.println("never get here");
		} catch (RuntimeException e) {
			getHugFromDaddy();
		} finally {
			seeMoreAnimals();
		}
		goHome();
	}

	private void goHome() {
		System.out.println("goHome");
	}

	private void seeMoreAnimals() {
		System.out.println("seeMoreAnimals");
	}

	private void getHugFromDaddy() {
		System.out.println("getHugFromDaddy");
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