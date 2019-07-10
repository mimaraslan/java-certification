package _028_singleton_synchronized_unique;

public class VisitorTicketTracker {

	// ---------- singleton object -------------------------------------

	// singletons in Java are created as private static variables
	private static VisitorTicketTracker instance;

	// all of the constructors are declared private in the singleton class
	// all constructors in a singleton class are marked private
	private VisitorTicketTracker() {
	}

	// accessed via a single public static method often named getInstance(),
	// which returns the reference to the singleton object.
	// synchronized - Synchronization is only needed the first time that the object is created.
	// synchronized - Creating Unique Singletons
	public static synchronized VisitorTicketTracker getInstance() {
		if (instance == null) {
			synchronized (VisitorTicketTracker.class) {
				if (instance == null) {
					instance = new VisitorTicketTracker();
				}
			}
		}
		return instance;
	}
	// ---------- singleton object -------------------------------------

	// Data access methods
}