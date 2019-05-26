package _0013_wrapper;

class MainApp {

	/*
	Primitive type 		Wrapper class
	---------------     -------------
	boolean				Boolean
    byte				Byte
	short				Short
	int 				Integer
	long 				Long
	float 				Float
	double 				Double
	char				Character
	*/
	public static void main(String[] args) {
		
		//Class to primitive   
		int primitive = Integer.parseInt("123"); 
		
		//primitive to Class
		Integer wrapper = Integer.valueOf("123");
		
	//	int bad1 = Integer.parseInt("a"); // throws NumberFormatException 
	//	Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

		
		
	}
}