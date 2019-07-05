package _018_casting_object_references;

public class Capybara extends Rodent {
	
	public Capybara() {
		System.out.println("Capybara");
	}

	public static void main(String[] args) {
		Rodent rodent = new Rodent();
		Capybara capybara = (Capybara) rodent; // Throws ClassCastException at runtime
		// code will compile without issue
		// it will throw a ClassCastException at runtime 
		// since the object being referenced is not an instance of the Capybara class. 
		// you can use the instanceof operator
		
		if(rodent instanceof Capybara) {
			 Capybara capybara2 = (Capybara)rodent;
		}
	}
}