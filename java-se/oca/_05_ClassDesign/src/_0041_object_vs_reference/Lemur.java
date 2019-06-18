package _0041_object_vs_reference;

public class Lemur extends Primate implements HasTail {
	
	public boolean isTailStriped() {
		return false;
	}

	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age); // 10
		System.out.println(lemur.isTailStriped());  // false
		System.out.println(lemur.hasHair()); // true

		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());  // false
		System.out.println(hasTail.age); // DOES NOT COMPILE
		System.out.println(hasTail.hasHair()); // DOES NOT COMPILE

		Primate primate = lemur;
		System.out.println(primate.hasHair()); // true
		System.out.println(primate.age); // DOES NOT COMPILE
		System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
		
		Object lemurAsObject = lemur;
		System.out.println(lemurAsObject.age); // DOES NOT COMPILE
		System.out.println(lemurAsObject.isTailStriped());  // DOES NOT COMPILE
		System.out.println(lemurAsObject.hasHair()); // DOES NOT COMPILE
	}
}