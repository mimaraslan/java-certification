package _0014_IllegalArgumentException;

public class MainApp {

	private int numberEggs;

	public void setNumberEggs(int numberEggs) {// setter
		if (numberEggs >= 0) // guard condition
			this.numberEggs = numberEggs;
		System.out.println(this.numberEggs);
	}

	public void setNumberEggs2(int numberEggs) {
		if (numberEggs >= 0)
			throw new IllegalArgumentException("# eggs must not be negative");
		this.numberEggs = numberEggs;
	}

	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.setNumberEggs(1);
		obj.setNumberEggs2(2);
	}
}