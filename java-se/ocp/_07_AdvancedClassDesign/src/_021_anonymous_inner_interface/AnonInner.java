package _021_anonymous_inner_interface;

public class AnonInner {

	public AnonInner() {
		System.out.println("AnonInner");
	}

	interface SaleTodayOnly {
		int dollarsOff();
	}

	public int pay(int basePrice) {
		return admission(100, new SaleTodayOnly() {
			public int dollarsOff() {
				System.out.println("dollarsOff");
				return 3;
			}
		});
	}

	public int admission(int basePrice, SaleTodayOnly sale) {
		System.out.println("admission");
		return basePrice - sale.dollarsOff();
	}

	public static void main(String[] args) {
		AnonInner anonInner = new AnonInner();
		System.out.println(anonInner.pay(100)); // 97
	}
}