package _0007_redundant_imports;

import java.lang.System;
import java.lang.*; //Redundant Import
import java.util.Random;
import java.util.*; //Redundant Import

public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}