package _028_synchronized_unique_singletons;

public class VisitorTicketTracker {
	
	private static VisitorTicketTracker instance;

	private VisitorTicketTracker() {
	}
	
	public static synchronized VisitorTicketTracker getInstance() {
		if (instance == null) {
			instance = new VisitorTicketTracker();
		}
		return instance;
	}
}