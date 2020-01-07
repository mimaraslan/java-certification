package _004_diamond_operator;

import java.util.*;

public class MainApp2 {

	List<String> names;

	MainApp2() {
		names = new ArrayList<>(); // matches instance variable declaration
		names.add("Katerina");
		System.out.println("instance variable : " + names); // instance variable : [Katerina]
	}

	public void copyNames() {
		ArrayList<String> copyOfNames;
		copyOfNames = new ArrayList<>(names); // matches local variable declaration
		System.out.println("local variable copyOfNames: " + copyOfNames); // local variable copyOfNames: [Katerina]
		System.out.println("local variable names: " + names); // local variable names: [Katerina]
	}

	public static void main(String[] args) {
		MainApp2 obj = new MainApp2();
		obj.copyNames();
		System.out.println(obj.names); // [Katerina]
	}
}