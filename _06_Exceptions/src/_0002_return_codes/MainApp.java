package _0002_return_codes;

public class MainApp {

	public int indexOf(String[] names, String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
						// 0   1   2   3   4
		String[] names = {"A","B","C","D","E"};
		String name = "C";
		
		MainApp obj = new MainApp();
		System.out.println(obj.indexOf(names, name)); // 2
	}
}