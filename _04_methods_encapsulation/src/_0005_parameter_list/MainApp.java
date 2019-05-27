package _0005_parameter_list;

public class MainApp {
	public void walk1() { }
	public void walk2 { } // DOES NOT COMPILE
	public void walk3(int a) { }
	public void walk4(int a; int b) { } // DOES NOT COMPILE
	public void walk5(int a, int b;) { } // DOES NOT COMPILE
	public void walk6(int a, int b,) { } // DOES NOT COMPILE
	public void walk7(int a, int b) { }
	public void walk8(int a, b) { }  // DOES NOT COMPILE
	public void walk9(a, int b) { }  // DOES NOT COMPILE
	public void walk10(a, b) { }  // DOES NOT COMPILE
}