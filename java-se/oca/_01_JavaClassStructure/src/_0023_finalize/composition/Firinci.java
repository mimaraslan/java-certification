package _0023_finalize.composition;

import _0023_finalize.composition.Bugday;
import _0023_finalize.composition.Ekmek;
import _0023_finalize.composition.Un;
import _0023_finalize.composition.Vitamin;

//kalitim  ve finalize - I
class Vitamin {

	private String isim;

	public Vitamin(String gelen) {
		isim = gelen;
		System.out.println("Vitamin yapilandirici : " + isim);
	}

	// finalize() methodunun çağrılması o sınıfa ait nesnelerin hafızadan silinmesi anlamına gelir.
	public void finalize() {
		System.out.println("Vitamin finalize() : " + isim);
	}
}


class Bugday {

	// classınızda composition yöntemi ile diğer class ları kullanmışsanız , 
	// bu kullanılan class ların finalize() methodlarının çağrılmasında sorun olamaz 
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

	// classınızda composition yöntemi ile diğer class ları kullanmışsanız , 
	// bu kullanılan class ların finalize() methodlarının çağrılmasında sorun olamaz 
	Vitamin a = new Vitamin("Un");

	public Un() {
		System.out.println("Un yapilandirici");
	}

	protected void finalize() throws Throwable {
		System.out.println("Un finalize()");
	}
}

class Ekmek extends Un {

	// classınızda composition yöntemi ile diğer class ları kullanmışsanız , 
	// bu kullanılan class ların finalize() methodlarının çağrılmasında sorun olamaz 
	Vitamin a = new Vitamin("Ekmek");

	public Ekmek() {
		System.out.println("Ekmek yapilandirici");
	}

	protected void finalize() throws Throwable {
		System.out.println("Ekmek finalize()");
	}
}


public class Firinci {

	public static void main(String args[]) {

		// ilk olarak türetilmiş class ların yok olması gereklidir.
		// Ana class , türemiş class dan daha önce hafısazan silinirse hata oluşur.
		new Ekmek();
		System.out.println("Temizlik Basliyor ... ");
		
		// Kontrol ve çağırma tamamen çalışma esnasında JVM tarafından ve otomatik yapılır.
		// Garbage Collector tetiklendi
		System.gc();
	}
}