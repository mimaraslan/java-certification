package _006_generic.example3;

public class Robot {
	public static void main(String[] args) {

		Create<Robot> create = new Create<>();
		
		Robot robot1 = new Robot();
		create.oneCreate(robot1);
		System.out.println(create);
		
		Robot robot2 = create.getInformation();
		System.out.println(robot2);

		Robot robot3 = new Robot();
		create.oneCreate(robot3);

		Robot robot4 = create.getInformation();
		System.out.println(robot4);
	}
}