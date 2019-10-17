package _0023_finalize;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	private static List<MainApp> myObjectLists = new ArrayList<MainApp>();

	// last operations
	protected void finalize() {
		myObjectLists.add(this); // Don't do this
		System.out.println("Calling finalize");
	}

	public static void main(String[] args) {
		new MainApp();
		System.gc();
	}
}