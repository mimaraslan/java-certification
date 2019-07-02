package _0009_catching_various_types;

class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}

public class MainApp {

	private void seeAnimal() {
		System.out.println("seeAnimal");
	}
	
	public void visitPorcupine() {
		try {
			seeAnimal();
		} catch (AnimalsOutForAWalk e) {// first catch block
			System.out.print("try back later");
		}	
//		  catch (ExhibitClosed e) {// second catch block
//			System.out.print("not today");
//		}
	}

	public void visitMonkeys() {
		try {
			seeAnimal();
		} catch (ExhibitClosed e) {
			System.out.print("not today");
		}	
//		  catch (ExhibitClosedForLunch e) {// DOES NOT COMPILE
//			System.out.print("try back later");
//		}
	}

	public void visitSnakes() {
		try {
			seeAnimal();
		} catch (RuntimeException e) {
			System.out.print("runtime exception");
//		} catch (ExhibitClosed e) {// DOES NOT COMPILE
//			System.out.print("not today");
		} catch (Exception e) {
			System.out.print("exception");
		}
	}
	
	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.visitPorcupine();
		obj.visitMonkeys();
		obj.visitSnakes();
	}
}
