package _026_singleton_pattern_static_block;

// Instantiation using a static block
public class StaffRegister {

	// ---------- singleton object -------------------------------------

	// singletons in Java are created as private static variables
	private static final StaffRegister instance;

	// all of the constructors are declared private in the singleton class
	// all constructors in a singleton class are marked private
	private StaffRegister() {
	}
	
	static {
		instance = new StaffRegister(); // Perform additional steps
	}

	// accessed via a single public static method often named getInstance(),
	// which returns the reference to the singleton object.
	public static StaffRegister getInstance() {
		return instance;
	}

	// ---------- singleton object -------------------------------------

// Data access methods
	
}