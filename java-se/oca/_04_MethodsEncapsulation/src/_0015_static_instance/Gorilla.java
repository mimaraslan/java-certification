package _0015_static_instance;

public class Gorilla {
	public static int count;

	public static void addGorilla() {
		count++;
	}

	public void babyGorilla() {
		count++;
	}

	public void announceBabies() {
		addGorilla();
		babyGorilla();
	}

	public static void announceBabiesToEveryone() {
		addGorilla();
		babyGorilla(); // DOES NOT COMPILE
	}

	public int total;
    public static average = total / count; // DOES NOT COMPILE
}