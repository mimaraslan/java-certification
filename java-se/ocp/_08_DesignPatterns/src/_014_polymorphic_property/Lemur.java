package _014_polymorphic_property;

public class Lemur extends Primate implements HasTail {
	
	public int age = 8;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age); // 8
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped()); // false
		
		Primate primate = lemur;
		System.out.println(primate.hasHair()); // true
		
		HasTail hasTail2 = lemur;
		System.out.println(hasTail2.age); // DOES NOT COMPILE
		
		Primate primate2 = lemur;
		System.out.println(primate2.isTailStriped()); // DOES NOT COMPILE
	}
}