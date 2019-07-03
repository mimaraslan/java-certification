package _0022_SwallowingException;

import java.io.IOException;

public class Hopper {

	private static void readInFile() throws IOException {
		throw new IOException();
	}

	public static void main(String[] args) {
		String textInFile = null;
		try {
			readInFile();
		} catch (IOException e) { // ignore exception		
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		// imagine many lines of code here
		System.out.println(textInFile.replace(" ", ""));
	}
}