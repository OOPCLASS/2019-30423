import java.lang.reflect.Array;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Deck tes1 = new Deck();
		 * 
		 * System.out.println(tes1.hasNext()); System.out.println(tes1.next());
		 * System.out.println(tes1.next()); System.out.println(tes1.next());
		 * System.out.println(tes1.next()); System.out.println(tes1.next());
		 * System.out.println(tes1.next()); System.out.println( "aici "+ tes1.iterator);
		 * System.out.println("inainte"+ tes1.decks.length); tes1.remove();
		 * tes1.remove(); System.out.println("dupa"+ tes1.decks.length);
		 * System.out.println(tes1.next()); System.out.println(tes1.next());
		 * 
		 * tes1.print();
		 */

		Deck test = new Deck();
		
		Card aux = new Card('3', "hearts");
	
		test.put(aux);
		System.out.println( test.cards[0].getNumber() + " " + test.cards[0].getSuit());
		test.cards[0].setNumber('k');
		System.out.println( test.cards[0].getNumber() + " " + test.cards[0].getSuit());
		test.remove();
		test.remove();
		test.hasNext();
		test.next();
		
		test.put(aux);
		aux.setNumber('Q');
		test.put(aux);
		aux.setNumber('4');
		test.put(aux);
		aux.setNumber('9');
		test.put(aux);
		aux.setNumber('A');
		test.put(aux);
		test.showDeck();
		test.showHand();
		
		
	}

}
