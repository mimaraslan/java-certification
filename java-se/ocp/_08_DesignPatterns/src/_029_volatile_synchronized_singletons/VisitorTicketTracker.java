package _029_volatile_synchronized_singletons;

public class VisitorTicketTracker {

	// Singletons with Double-Checked Locking
	// volatile - prevents a subtle case where the compiler tries to optimize the code 
	// such that the object is accessed before it is fnished being constructed. 
	private static volatile VisitorTicketTracker instance;

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
}