package _0012_instance_initializer_blocks;


				  //class definition
public class Name {

	String first;
	String last;
	String full;

	//instance initializer, static block outside
	{
			first = "A";
			last = "B";
			full = first + last;
			
			System.err.println("static block - outside ----> 4 : "+ full);
	}
	
	             // constructor
	public Name() {

		first = "C";
		last = "D";
		full = first + last;
		
		System.out.println("myConstructor: "+ full);
	}
	
										   // method declaration
	public static void main(String[] args) {
		
		System.out.println("1");
		
		// inner block
		{
			System.out.println("static block - main -> 2");
		}
		
		System.out.println("3");

		Name nameObj = new Name(); //	---->  4  	---->  5
		
		{
			System.out.println("static block - main -> 6");
		}
		
		Name nameObj2 = new Name(); //	---->  4  	---->  5

		
		System.out.println("7");
		
		{
			System.out.println("static block - main -> 8");
		}

	}
	
	//instance initializer, static block outside
	{
		System.err.println("static block - outside ----> 5");
	}
}