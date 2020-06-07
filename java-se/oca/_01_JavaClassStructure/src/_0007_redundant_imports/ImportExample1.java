package _0007_redundant_imports;

import java.lang.System;

//Redundant Import
import java.lang.*;

import java.util.Random;

//Redundant Import
import java.util.*; 

public class ImportExample1 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
	}
}