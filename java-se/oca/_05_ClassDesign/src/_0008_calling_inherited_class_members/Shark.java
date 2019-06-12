package _0008_calling_inherited_class_members;

class Fish {
	protected int size;
	private int age; // 50

	public Fish(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
}

public class Shark extends Fish {
	private int numberOfFins = 8;

	public Shark(int age) {
		super(age);
		this.size = 4;
	}

	public void displaySharkDetails1() {
		System.out.print("Shark with age: " + getAge()); // 50
		System.out.print(" and " + size + " meters long"); // 4
		System.out.print(" with " + numberOfFins + " fins\n\n"); // 8
	}
	
	public void displaySharkDetails2() {
		 System.out.print("Shark with age: "+this.getAge());
		 System.out.print(" and "+this.size+" meters long");
		 System.out.print(" with "+this.numberOfFins+" fins\n\n");
	}
	
	public void displaySharkDetails3() {
		 System.out.print("Shark with age: "+super.getAge());
		 System.out.print(" and "+super.size+" meters long");
		 System.out.print(" with "+this.numberOfFins+" fins\n\n");
	}
	
	public void displaySharkDetails4() {
		 System.out.print("Shark with age: "+super.getAge());
		 System.out.print(" and "+super.size+" meters long");
		// System.out.print(" with "+super.numberOfFins+" fins"); // DOES NOT COMPILE
	}
	
	public static void main(String[] args) {
		Shark obj = new Shark(50);
		obj.displaySharkDetails1();
		obj.displaySharkDetails2();
		obj.displaySharkDetails3();
	}
}