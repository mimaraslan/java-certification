package _0010_throwing_a_second_exception;

import java.io.FileReader;
import java.io.IOException;

public class MainApp {

	private static FileReader read() throws IOException {
		return null;
	}

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = read();
			System.out.println("try 1");
		} catch (IOException e) {
			System.out.println("catch 1 : "+ e);

			try {
				System.out.println("try 2");
				if (reader != null) {
					reader.close();
				}
			} catch (IOException inner) {
				System.out.println("catch 2 : "+ inner);
			}
		}
	}
}