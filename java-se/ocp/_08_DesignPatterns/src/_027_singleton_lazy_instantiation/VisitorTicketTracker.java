package _027_singleton_lazy_instantiation;

//Lazy instantiation
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
	public static VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
		}
		return instance;
	}
	// ---------- singleton object -------------------------------------

// Data access methods
}