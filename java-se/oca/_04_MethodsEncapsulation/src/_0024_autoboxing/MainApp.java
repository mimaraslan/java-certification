package _0024_autoboxing;

public class MainApp {

	public void fly(int numMiles) {
		System.out.println("int");
	}

	public void fly(Integer numMiles) {
		System.out.println("Integer");
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.fly(3); // int
	}
}