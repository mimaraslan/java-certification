package _004_diamond_operator;

import java.util.*;

public class Doggies {
	
	List<String> names;

	Doggies() {
		names = new ArrayList<>(); // matches instance variable declaration
		System.out.println("instance variable : " + names);
	}

	public void copyNames() {
		ArrayList<String> copyOfNames;
		copyOfNames = new ArrayList<>(); // matches local variable declaration
		System.out.println("local variable : " + names);
	}

	public static void main(String[] args) {
		Doggies doggies = new Doggies();
		doggies.copyNames();
		System.out.println(doggies.names);
	}
}