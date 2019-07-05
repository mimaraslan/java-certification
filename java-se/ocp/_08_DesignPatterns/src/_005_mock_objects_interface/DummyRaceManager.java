package _005_mock_objects_interface;

import java.util.List;

public class DummyRaceManager implements RaceManager {
	
	public Animal getWinner(List<Animal> animals) {
		return animals == null || animals.size() == 0 ? null : animals.get(0);
	}
	
	public static void main(String[] args) {
		DummyRaceManager obj = new DummyRaceManager();
		System.out.println(obj.getWinner(null));
	}
}