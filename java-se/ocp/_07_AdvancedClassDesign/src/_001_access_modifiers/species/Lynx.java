package _001_access_modifiers.species;

import _001_access_modifiers.cat.BigCat;

public class Lynx extends BigCat {
	public static void main(String[] args) {
		Lynx lynx = new Lynx();
		System.out.println(lynx.name);
		System.out.println(lynx.hasFur);
		System.out.println(lynx.hasPaws);
		System.out.println(lynx.id);
	}
}