package _0035_default_methods_interface;

public class MainApp implements IsWarmBlooded {

	@Override
	public boolean hasScales() {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		MainApp mainApp = new MainApp();
		System.out.println(mainApp.getTemperature()); // calls default method
	}
}
