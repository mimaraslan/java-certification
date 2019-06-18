package _0024_extending_abstract_class;

public abstract class BigCat extends Animal {
	
	/*
	 Implementing an abstract method in a subclass follows the same rules for overriding a method.
	 For example, the name and signature must be the same, and the visibility of the method 
	 in the subclass must be at least as accessible as the method in the parent class.
	 */ 
//	protected String getName() {  // DOES NOT COMPILE
	public    String getName() {
		return "BigCat";
	}
	
	public abstract void roar();
}