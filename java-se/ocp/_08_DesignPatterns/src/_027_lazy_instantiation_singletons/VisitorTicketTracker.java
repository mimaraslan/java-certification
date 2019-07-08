package _027_lazy_instantiation_singletons;

//Lazy instantiation
public class VisitorTicketTracker {

	private static VisitorTicketTracker instance;

	private VisitorTicketTracker() {
	}

	public static VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
		}
		return instance;
	}
// Data access methods
}