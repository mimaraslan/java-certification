package _0043_object_casting_reference;

public class Capybara extends Rodent {

	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		Capybara capybara = null;
		
		if (rodent instanceof Capybara) {
			 capybara = (Capybara) rodent; // Throws ClassCastException at runtime
		} else {
			System.out.println("rodent:" + rodent);
			System.out.println("capybara:" + capybara);
		}

	}
}