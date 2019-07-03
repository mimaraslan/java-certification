package _0018_StackOverflowError;

public class MainApp {

	public static void doNotCodeThis(int num) {
		//  With an infİnite loop, Java just uses all your CPU until you can kill it.
		doNotCodeThis(1);
	}
	/*
	 Exception in thread "main" java.lang.StackOverflowError
	 at _0018_StackOverflowError.MainApp.doNotCodeThis(MainApp.java:6)
	 at _0018_StackOverflowError.MainApp.doNotCodeThis(MainApp.java:6)
	 at _0018_StackOverflowError.MainApp.doNotCodeThis(MainApp.java:6)
	...
	...
	 */
	
	public static void main(String[] args) {
		doNotCodeThis(2);
	}
}