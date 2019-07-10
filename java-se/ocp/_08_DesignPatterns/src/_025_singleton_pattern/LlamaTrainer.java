package _025_singleton_pattern;

public class LlamaTrainer {

	public boolean feedLlamas(int numberOfLlamas) {

		int amountNeeded = 5 * numberOfLlamas;

		HayStorage hayStorage = HayStorage.getInstance(); // singleton object

		if (hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}

		boolean fed = hayStorage.removeHay(amountNeeded);

		if (fed)
			System.out.println("Llamas have been fed");
		return fed;
	}
	
	public static void main(String[] args) {
		LlamaTrainer obj = new LlamaTrainer();
		obj.feedLlamas(10);
	}
}