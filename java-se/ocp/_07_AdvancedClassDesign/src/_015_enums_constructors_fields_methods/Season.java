package _015_enums_constructors_fields_methods;

public enum Season {
	
	 	WINTER{ public void printHours() { System. out .println("9am-3pm"); } }, 
	 	SPRING{ public void printHours() { System. out .println("9am-5pm"); } }, 
	 	SUMMER{ public void printHours() { System. out .println("9am-7pm"); } }, 
	 	FALL  { public void printHours() { System. out .println("9am-5pm"); } }; 
	
	public abstract void printHours();
} 