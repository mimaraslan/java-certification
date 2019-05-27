package _0003_return_type;

public class MainApp {

	public void walk1() { }
	public void walk2() { return; }
	public String walk3() { return ""; }
	public String walk4() { } // DOES NOT COMPILE
	public walk5() { } // DOES NOT COMPILE
	String walk6(int a) { if (a == 4) return ""; } // DOES NOT COMPILE
	
	int integer() {
		return 9;
	}

	int long(){  // DOES NOT COMPILE
		return 9L; // DOES NOT COMPILE
	}
	
	int integerExpanded() {
		int temp = 9;
		return temp;
	}
	
	int longExpanded() {
		int temp = 9L; // DOES NOT COMPILE
		return temp;
	}
		
}
