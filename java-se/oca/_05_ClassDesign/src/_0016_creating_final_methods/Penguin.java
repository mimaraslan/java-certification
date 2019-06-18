package _0016_creating_final_methods;

public class Penguin extends Bird {
	public final boolean hasFeathers() { // DOES NOT COMPILE
		return false;
	}
}
