
public class MainClass {

	public static void main(String[] args) {
		SuitOfCards suitOfCards = new SuitOfCards();
		Card heartsk = new Card("hearts", "K");
		suitOfCards.put(heartsk);
		suitOfCards.showCards();
		Card heartsk1 = new Card("hearts", "K");
		Card spades11= new Card("spades","11");
		Card diamondsA= new Card("diamonds","A");
		suitOfCards.put(diamondsA);
		suitOfCards.put(heartsk1);
		suitOfCards.showCards();
		
		}

	}

