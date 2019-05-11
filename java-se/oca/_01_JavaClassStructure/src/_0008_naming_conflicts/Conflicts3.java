package _0008_naming_conflicts;

//CASE 1
//import java.util.*; //OKEY
//import java.sql.*;  //DOES NOT COMPILE


//CASE 2
//import java.util.Date; //OKEY
//import java.sql.*; //REDUNDANT IMPORT


//CASE 3
//import java.util.Date; 
//import java.sql.Date; // ERROR


//CASE 4
//import java.util.Date; 

//CASE 5
// fully qualified class name

public class Conflicts3 {
	java.util.Date date;
	java.sql.Date sqlDate; 	
	// some more code
}