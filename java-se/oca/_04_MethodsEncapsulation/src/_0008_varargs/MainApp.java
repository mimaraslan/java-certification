package _0008_varargs;

public class MainApp {
	public void walk1(int... nums) { }
	public void walk2(int start, int... nums) { }
	public void walk3(int start, int ... nums) { }
	public void walk4(int... nums, int start) { } // DOES NOT COMPILE
	public void walk5(int... start, int... nums) { } // DOES NOT COMPILE
	public void walk6(int start, int nums ...) { } // DOES NOT COMPILE
	
	public void walk7(int... a, int b, int c ) { } // DOES NOT COMPILE
	public void walk8(int ... a, int b, int c ) { } // DOES NOT COMPILE
	public void walk9(int a..., int b, int c ) { } // DOES NOT COMPILE
	
	public void walk10(int a, int... b, int c ) { } // DOES NOT COMPILE
	public void walk11(int a, int ... b, int c ) { } // DOES NOT COMPILE
	public void walk12(int a, int b ..., int c) { }// DOES NOT COMPILE
	
	public void walk13(int a, int b, int... c ) { } 
	public void walk14(int a, int b, int ... c ) { } // DOES NOT COMPILE
	public void walk15(int a, int b, int c ...) { } // DOES NOT COMPILE

}