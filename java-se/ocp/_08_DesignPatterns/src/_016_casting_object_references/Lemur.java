package _016_casting_object_references;

public class Lemur extends Primate implements HasTail {
	
	public int age = 10;

	public boolean isTailStriped() {
		return false;
	}

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age); // 10
		System.out.println(lemur.hashCode()+"\n"); // 2018699554
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped()); // false
		System.out.println(hasTail.hashCode()+"\n"); // 2018699554  
		
	 // Casting an object from a subclass to a superclass doesn’t require an explicit cast.
		Primate primate = lemur;
		
	 // Casting an object from a superclass to a subclass requires an explicit cast.
	 // Lemur lemur2 = 		  primate; // DOES NOT COMPILE
		Lemur lemur3 = (Lemur)primate;
		System.out.println(lemur3.hashCode()+"\n"); // 2018699554  
		System.out.println(lemur3.age);
		
		System.out.println(primate.hasHair()); // true
		System.out.println(primate.hashCode()+"\n");  // 2018699554
		
		Object lemurAsObject = lemur;
		System.out.println(lemurAsObject); // true
		System.out.println(lemurAsObject.hashCode());  // 2018699554
		
	}
}