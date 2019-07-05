package _017_private_interfaces;

public class CaseOfThePrivateInterface {

	public CaseOfThePrivateInterface() {
		System.out.println("CaseOfThePrivateInterface Constructor");
	}

	// inner class, an inner interface can be private or protected
	private interface Secret {
		public void shh();
	}

	class DontTell implements Secret {

		public DontTell() {
			System.out.println("DontTell Constructor");	
		}

		public void shh() {
			System.out.println("DontTell shh");
		}
	}

	public static void main(String[] args) {
		CaseOfThePrivateInterface obj1 = new CaseOfThePrivateInterface();
		
		CaseOfThePrivateInterface.DontTell obj2 = new DontTell(); // DOES NOT COMPILE
	}
}