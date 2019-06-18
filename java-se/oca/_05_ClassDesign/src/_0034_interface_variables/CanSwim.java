package _0034_interface_variables;

public interface CanSwim {
	
	// Interface variables are assumed to be public, static, and final
	int MAXIMUM_DEPTH = 100;
	
	// marking a variable as private or protected will trigger a compiler error, 
	// as will marking any variable as abstract
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
}