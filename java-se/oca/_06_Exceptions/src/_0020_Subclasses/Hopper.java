package _0020_Subclasses;

class CanNotHopException extends Exception {
}

class Hopper {
	public void hop() { }
	public void hop2() throws CanNotHopException { }
	public void hop3() throws Exception { }
	public void hop4() throws Exception { }
}

class Bunny extends Hopper {
	public void hop() throws CanNotHopException { } // DOES NOT COMPILE
	public void hop2() { }
	public void hop3() throws CanNotHopException { }
	public void hop4() throws IllegalStateException { }
	
	public static void main(String[] args) {
		Bunny obj = new Bunny();
		obj.hop();
		obj.hop2();
		obj.hop3();
		obj.hop4();
	}
}