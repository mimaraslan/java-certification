package _0002_immutability;

public class Mutable {
	private String s;

	// Setter makes it mutable
	public void setS(String newS) {
		s = newS;
	}

	public String getS() {
		return s;
	}
}

//immutable classes in Java are final, and subclasses can’t add mutable behavior.
final class Immutable {
	private String s = "name";

	public String getS() {
		return s;
	}
}