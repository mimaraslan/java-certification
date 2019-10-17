package _0023_finalize.inheritance;

//kalitim  ve finalize - II
class Vitamin {

	private String isim;

	public Vitamin(String gelen) {
		isim = gelen;
		System.out.println("Vitamin yapilandirici : " + isim);
	}

	public void finalize() {
		System.out.println("Vitamin finalize() : " + isim);
	}
}


class Bugday {

	Vitamin a = new Vitamin("Bugday");

	public Bugday() {
		System.out.println("Bugday yapilandirici");
	}

	protected void finalize() throws Throwable {
		System.out.println("Bugday finalize()");
	}
}

// Türemiş class'ın finalize() methodunu çağırmak yazılımcının sorumluluğundadır.
class Un extends Bugday {

	Vitamin a = new Vitamin("Un");

	public Un() {
		System.out.println("Un yapilandirici");
	}

	protected void finalize() throws Throwable {
		System.out.println("Un finalize()");
		super.finalize();
	}
}


// Türemiş class'ın finalize() methodunu çağırmak yazılımcının sorumluluğundadır.
class Ekmek extends Un {

	Vitamin a = new Vitamin("Ekmek");

	public Ekmek() {
		System.out.println("Ekmek yapilandirici");
	}

	protected void finalize() throws Throwable {
		System.out.println("Ekmek finalize()");
		super.finalize();
	}
}


public class Firinci2 {

	public static void main(String args[]) {

		new Ekmek();
		System.out.println("Temizlik Basliyor ... ");
		System.gc();
	}
}