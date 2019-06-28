package _0034_interface_variables;

public interface CanSwim {
	
	// Interface variables are assumed to be public, static, and final
	int MAXIMUM_DEPTH = 100;
	
	// marking a variable as private or protected will trigger a compiler error, 
	// as will marking any variable as abstract
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
	
	// Interface variables are assumed to be public, static, and final
	// Automatically insert public static final to any constant interface variables it finds missing those modifiers
	public static final int MAXIMUM_DEPTH2 = 100;
	public static final boolean UNDERWATER2 = true;
	public static final String TYPE2 = "Submersible";
}