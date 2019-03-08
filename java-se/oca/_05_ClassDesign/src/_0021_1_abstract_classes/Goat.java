package _0021_1_abstract_classes;

public abstract class Goat {
	
	// abstract method can not be final
	public abstract final void chew1(); // DOES NOT COMPILE
	public final abstract void chew2(); // DOES NOT COMPILE
}