package _0020_passing_data_among_methods;

public class MainApp3 {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		speak(name); ////Copying a reference with pass-by-value
		System.out.println(name); // Aslan
	}
    
	public static void speak(StringBuilder s) {
		s.append("Aslan");
	}

}