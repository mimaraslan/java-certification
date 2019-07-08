package _026_singleton_pattern;

// Instantiation using a static block
public class StaffRegister {

	private static final StaffRegister instance;

	static {
		instance = new StaffRegister(); // Perform additional steps
	}

	private StaffRegister() {
	}

	public static StaffRegister getInstance() {
		return instance;
	}

// Data access methods
}