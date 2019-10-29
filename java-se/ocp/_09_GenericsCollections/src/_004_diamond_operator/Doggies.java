package _004_diamond_operator;

import java.util.*;

public class Doggies {

	List<String> names;

	Doggies() {
		names = new ArrayList<>(); // matches instance variable declaration
		names.add("Katerina");
		System.out.println("instance variable : " + names); // instance variable : [Katerina]
	}

	public void copyNames() {
		ArrayList<String> copyOfNames;
		copyOfNames = new ArrayList<>(names); // matches local variable declaration
		System.out.println("local variable copyOfNames: " + copyOfNames); // local variable copyOfNames: []
		System.out.println("local variable names: " + names); // local variable names: [Katerina]
	}

	public static void main(String[] args) {
		Doggies doggies = new Doggies();
		doggies.copyNames();
		System.out.println(doggies.names); // [Katerina]
	}
}





