package _0029_default_constructor;

class Rabbit1 {
}

class Rabbit2 {
	public Rabbit2() {
	}
}

class Rabbit3 {
	public Rabbit3(boolean b) {
	}
}

class Rabbit4 {
	private Rabbit4() {
	}
}

public class RabbitsMultiply {
	public static void main(String[] args) {
		Rabbit1 r1 = new Rabbit1();
		Rabbit2 r2 = new Rabbit2();
		Rabbit3 r3 = new Rabbit3(true);
		Rabbit4 r4 = new Rabbit4(); // DOES NOT COMPILE
	}
}