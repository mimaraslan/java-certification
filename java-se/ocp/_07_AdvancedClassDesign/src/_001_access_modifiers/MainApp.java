package _001_access_modifiers;

import _0001_access_modifiers.cat.BigCat;
import _0001_access_modifiers.species.Lynx;

public class MainApp {
	public static void main(String[] args) {
		BigCat cat = new BigCat();
		System.out.println(cat.name);
		System.out.println(cat.hasFur);
		System.out.println(cat.hasPaws);
		System.out.println(cat.id);

		Lynx lynx = new Lynx();
		System.out.println(lynx.name);
		System.out.println(lynx.hasFur);
		System.out.println(lynx.hasPaws);
		System.out.println(lynx.id);
	}
}