package _0025_reference_types;

public class MainApp {
	
	public void fly(String s) {
		System.out.println("string ");
	}

	public void fly(Object o) {
		System.out.println("object ");
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.fly("test");
		obj.fly(56);
	}
}