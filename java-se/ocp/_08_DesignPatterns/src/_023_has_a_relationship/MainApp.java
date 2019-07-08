package _023_has_a_relationship;

public class MainApp {
	public static void main(String[] args) {
		Toyota myToyota = new Toyota();
		myToyota.setColor("Blue");
		myToyota.setMaxSpeed(220);
		myToyota.carInfo();
		myToyota.startEngine();
	}
}