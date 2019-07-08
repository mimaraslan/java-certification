package _025_singleton_pattern;

public class HayStorage {

	private int quantity = 0;

	private HayStorage() {
	}
	
	//singleton***************************************				 
	private static final HayStorage instance = new HayStorage();

	public static HayStorage getInstance() {
		return instance;
	}
	//singleton***************************************				 

	
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