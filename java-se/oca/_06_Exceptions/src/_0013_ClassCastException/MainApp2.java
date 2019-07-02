package _0013_ClassCastException;

public class MainApp2 {
	
	public static void main(String[] args) {
		String type = "moose";
		Object obj = type;
		Integer number = (Integer) obj; 
		System.out.println(number);
	}
}
