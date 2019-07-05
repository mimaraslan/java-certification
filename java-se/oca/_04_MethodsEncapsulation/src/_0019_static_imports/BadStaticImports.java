package _0019_static_imports;

import static java.util.Arrays.*;
static import java.util.Arrays.*; // DOES NOT COMPILE

import static java.util.Arrays; // DOES NOT COMPILE
static import java.util.Arrays; // DOES NOT COMPILE

import static java.util.Arrays.asList;
static import java.util.Arrays.asList; // DOES NOT COMPILE

public class BadStaticImports {
 
	 public static void main(String[] args) {
		 Arrays.asList("Katerina"); // DOES NOT COMPILE
		 		asList("Katerina"); 
	 } 
}