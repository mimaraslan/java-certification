package _0012_ArrayIndexOutOfBoundsException;

// Runtime exceptions can be thrown by the programmer or by the JVM.
public class MainApp {
	public static void main(String[] args) {
		int[] countsOfMoose = new int[3];
		System.out.println(countsOfMoose[-1]); 
	}
}
