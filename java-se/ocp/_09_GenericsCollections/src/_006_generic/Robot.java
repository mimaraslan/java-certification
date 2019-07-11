package _006_generic;

public class Robot {
	public static void main(String[] args) {

		Crate<Robot> crateForRobot = new Crate<>();
		
		Robot robot = new Robot();
		crateForRobot.packCrate(robot);
		Robot inNewHome = crateForRobot.emptyCrate();

		Robot joeBot = new Robot();
		Crate<Robot> robotCrate = new Crate<>();
		robotCrate.packCrate(joeBot);

		// ship to St. Louis
		Robot atDestination = robotCrate.emptyCrate();
	}
}
