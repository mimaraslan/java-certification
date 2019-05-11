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
import java.util.Date; 

public class Conflicts2 {
	Date date;
	java.sql.Date sqlDate; 
	//If You Really Need to Use Two Classes with the Same Name
	
	// some more code
}