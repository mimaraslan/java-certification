package _019_anonymous_inner_abstract_classes;

public class AnonInner {

	public AnonInner() {
		System.out.println("AnonInner");
	}

	abstract class SaleTodayOnly {
		public SaleTodayOnly() {
			System.out.println("SaleTodayOnly");
		}

		abstract int dollarsOff();
	}

	public int admission(int basePrice) {
		System.out.println("admission");

		SaleTodayOnly sale = new SaleTodayOnly() {
			int dollarsOff() {
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