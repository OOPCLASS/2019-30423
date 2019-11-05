
public class Card implements Comparable<Card> {
	private String suit;
	private String number;

	public Card(String suit,String number) {
		if("2345678910".contains(number) || number=="A" || number=="J" || number=="K" || number=="Q") {
			this.number=number;
		}
		else {
			System.out.println("A card with this value doesn't exist.");
			this.number="0";
		}
		if(suit == "spades" || suit == "diamonds" || suit == "clubs" || suit == "hearts") {
			this.suit=suit;
		}
		else {
			System.out.println("A card with this colour does't exist.");
			this.number="0";
		}
		
	}

	public String getSuitName() {
		return suit;
	}

	public String getCardNumber() {
		return number;
	}

	public int compareTo(Card objectToCompareTo) {
		if (objectToCompareTo instanceof Card) {
			if (this.getCardNumber().equals(objectToCompareTo.getCardNumber()) && this.getSuitName().equals(objectToCompareTo.getSuitName())) {
				return 0;
			} else {
				if (this.getCardNumber().equals(objectToCompareTo.getCardNumber())) {
					return 1;
				} else {
					if ("2345678910".contains(this.getCardNumber())) {
						if ("2345678910".contains(objectToCompareTo.getCardNumber())) {
							if (this.getCardNumber().equals("10")) {
								return 2;
							}
							if (objectToCompareTo.getCardNumber().equals("10")) {
								return -1;
							}
							if (this.getCardNumber().compareTo(objectToCompareTo.getCardNumber()) > 0) {
								return 2;
							}
						}
						else {
							return -1;
						}
					}
					else {
						if(((Card)objectToCompareTo).number=="A") {
							return -1;
						}
						if(((Card)objectToCompareTo).number=="K" && (this.number=="Q" || this.number=="J")) {
							return -1;
						}
						if(((Card)objectToCompareTo).number=="Q" && this.number=="J") {
							return -1;
						}
						return 2;	
					}
				}
			}

		}
		return 0;
	}
}
