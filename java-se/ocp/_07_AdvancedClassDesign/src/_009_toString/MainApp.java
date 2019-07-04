package _009_toString;

import java.util.ArrayList;

public class MainApp {
	public static void main(String[] args) {
		System.out.println(new ArrayList()); // []
		System.out.println(new ArrayList<Object>()); // []
		System.out.println(new String[0]); // [Ljava.lang.String;@15db9742
	}
}