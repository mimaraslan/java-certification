package _029_singleton_synchronized_volatile;

public class VisitorTicketTracker {

	// ---------- singleton object -------------------------------------

	// singletons in Java are created as private static variables
	// volatile - prevents a subtle case where the compiler tries to optimize the code
	// such that the object is accessed before it is fnished being constructed.
	// volatile - Singletons with Double-Checked Locking
	private static volatile VisitorTicketTracker instance;

	// all of the constructors are declared private in the singleton class
	// all constructors in a singleton class are marked private
	private VisitorTicketTracker() {
	}

	// accessed via a single public static method often named getInstance(),
	// which returns the reference to the singleton object.
	// synchronized - Synchronization is only needed the first time that the object is created.
	// synchronized - Creating Unique Singletons
	public static VisitorTicketTracker getInstance() {
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