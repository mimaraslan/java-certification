package _0008_naming_conflicts;

//CASE 1
//import java.util.*; //OKEY
//import java.sql.*;  //DOES NOT COMPILE

//CASE 2
//import java.sql.*;  //OKEY
//import java.util.*; //DOES NOT COMPILE

//CASE 3
//import java.util.Date; //OKEY
//import java.sql.*;     //REDUNDANT IMPORT

//CASE 4
//import java.sql.Date;  //OKEY
//import java.util.*;    //REDUNDANT IMPORT

//CASE 5
//import java.util.Date; //OKEY
//import java.sql.Date;  //ERROR

//CASE 6
import java.sql.Date;    //OKEY
//import java.util.Date; //ERROR


public class Conflicts1 {
	Date date;
	// some more code
}