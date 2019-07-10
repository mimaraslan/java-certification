package _028_synchronized_unique_singletons;

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
	// synchronized - Synchronization is only needed the frst time that the object
	// is created.
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