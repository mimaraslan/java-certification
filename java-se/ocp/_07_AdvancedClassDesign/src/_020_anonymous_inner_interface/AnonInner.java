package _020_anonymous_inner_interface;

public class AnonInner {

	public AnonInner() {
		System.out.println("AnonInner");
	}

	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int admission(int basePrice) {
		System.out.println("admission");

		SaleTodayOnly sale = new SaleTodayOnly() {
			public int dollarsOff() {
				System.out.println("dollarsOff");
				return 3;
			}
		};
		return basePrice - sale.dollarsOff();
	}

	public static void main(String[] args) {
		AnonInner anonInner = new AnonInner();
		System.out.println(anonInner.admission(100)); // 97
	}
}