package _011_hashCode;

public class Card {
	private String rank;
	private String suit;

	public Card(String r, String s) {
		if (r == null || s == null)
			throw new IllegalArgumentException();
		rank = r;
		suit = s;
	}

	public boolean equals(Object obj) {
		if (!(obj instanceof Card))
			return false;
		Card c = (Card) obj;
		return rank.equals(c.rank) && suit.equals(c.suit);
	}
	
	 public int hashCode() { return rank.hashCode(); } 
//	 public int hashCode() { return Integer.parseInt(rank); }
//	 public int hashCode() { return 6; }
//	 public long hashcode() { return Integer.parseInt(rank); }
//	 public int hashCode() { return Integer.parseInt(rank) * 7 + Integer.parseInt(rank); }
	
	public static void main(String[] args) {
		Card card1 = new Card("10", "Katerina");
		Card card2 = new Card("10", "Katerina");
		Card card3 = new Card("20", "Lena");

		System.out.println("card1.equals(card2) : " + card1.equals(card2));
		System.out.println("card1.equals(card3) : " + card1.equals(card3));
		
		System.out.println("card1.hashCode() : " + card1.hashCode());
		System.out.println("card2.hashCode() : " + card2.hashCode());
		System.out.println("card3.hashCode() : " + card3.hashCode());
	}
}