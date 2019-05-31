package _0020_passing_data_among_methods;

public class MainApp2 {
	public static void main(String[] args) {

		int num = 4;
		newNumber(5);
		System.out.println(num); // 4
	}

	public static void newNumber(int num) {
		num = 8;
	}
}
