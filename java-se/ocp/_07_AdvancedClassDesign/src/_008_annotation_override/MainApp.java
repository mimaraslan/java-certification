package _008_annotation_override;

class Bobcat {
	public Bobcat() { System.out.println("Bobcat"); }
	public void findDen() { System.out.println("Bobcat findDen\n"); }
}

class BobcatMother extends Bobcat {
	
	public BobcatMother() { System.out.println("BobcatMother"); }

	@Override
	public void findDen() { System.out.println("BobcatMother findDen\n"); }
}

public class MainApp {
	public static void main(String[] args) {
		Bobcat bobcat = new Bobcat();
		bobcat.findDen();
		
		BobcatMother bobcatMother = new BobcatMother();
		bobcatMother.findDen();
		
		Bobcat obj = new BobcatMother();
		obj.findDen();
		
		// BobcatMother obj = new Bobcat(); // DOES NOT COMPILE
		// obj.findDen();
	}
}