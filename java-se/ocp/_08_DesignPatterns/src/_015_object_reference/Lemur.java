package _015_object_reference;

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

		Primate primate = lemur;
		System.out.println(primate.hasHair()); // true
		System.out.println(primate.hashCode()+"\n");  // 2018699554

		Object lemurAsObject = lemur;
		System.out.println(lemurAsObject); // true
		System.out.println(lemurAsObject.hashCode());  // 2018699554

	}
}