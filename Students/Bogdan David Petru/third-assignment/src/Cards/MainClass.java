package Cards;

public class MainClass {

	public static void main(String[] args) {
	/*	IteratorClass i = new IteratorClass();
		String card;
		card=i.next();
		System.out.println(card);
		System.out.println(i.next());
		i.remove("J");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}*/
		Card card1 = new Card("10","Heart");
		Card card2 = new Card("10","Heart");
		Card card3 = new Card("J","black");
		Card card4 = new Card("A","Spade");
		OrderedIterator It = new OrderedIterator();
		It.put(card1);
		It.put(card2);
		It.put(card3);
		It.put(card4);
		It.printCards();
	}
	
}
