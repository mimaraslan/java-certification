package _0017_ExceptionInInitializerError;

public class MainApp {

	static {
		int[] countsOfMoose = new int[3];
		int num = countsOfMoose[-1];
	}
	/*
	 Exception in thread "main" java.lang.ExceptionInInitializerError
	 Caused by: java.lang.ArrayIndexOutOfBoundsException: -1
	 at _0017_ExceptionInInitializerError.MainApp.<clinit>(MainApp.java:7)
	 */
	
	public static void main(String[] args) {
	}
}