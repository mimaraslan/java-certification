package _025_singleton_pattern;

public class HayStorage {
	
	//---------- singleton object -------------------------------------				 
	
	// singletons in Java are created as private static variables 
	private static final HayStorage instance = new HayStorage();

    // all of the constructors are declared private in the singleton class
	// all constructors in a singleton class are marked private
	private HayStorage() {
	}
	
	// accessed via a single public static method often named getInstance(),
	// which returns the reference to the singleton object. 
	public static HayStorage getInstance() {
		return instance;
	}
	
	//---------- singleton object -------------------------------------				 

	private int quantity = 0;
	
	// synchronized - prevent two processes from running the same method at the exact same time.
	public synchronized void addHay(int amount) {
		quantity += amount;
	}

	public synchronized boolean removeHay(int amount) {
		if (quantity < amount)
			return false;
		quantity -= amount;
		return true;
	}

	public synchronized int getHayQuantity() {
		return quantity;
	}
}