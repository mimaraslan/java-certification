package _0007_calling_constructors;

class Primate extends Object {
	public Primate() {
//		super();
		System.out.println("Primate");
	}
}

class Ape extends Primate {
	public Ape() {
//		super();
		System.out.println("Ape");
	}
}

public class Chimpanzee extends Ape {
	
//	public Chimpanzee() {
//		super();
//	}
	
	public static void main(String[] args) {
		new Chimpanzee();
	}
}