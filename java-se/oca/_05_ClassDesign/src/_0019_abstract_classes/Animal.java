package _0019_abstract_classes;

// Abstract classes may not be marked as private or final.
public abstract class Animal {
	protected int age;

	public void eat() {
		System.out.println("Animal is eating");
	}

 // private   abstract String getName1();  // DOES NOT COMPILE
			  abstract String getName2();
	protected abstract String getName3();
	public    abstract String getName4();
}