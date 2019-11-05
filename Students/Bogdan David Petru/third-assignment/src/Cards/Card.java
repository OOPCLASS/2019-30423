//import sorting.Comparable;
package Cards;
import sorting.Comparable;



public class Card implements Comparable{

	String number,suit;
	public String nrs="2345678910";
	public Card(String number,String suit) {
		if(nrs.contains(number) || number=="A" || number=="J" || number=="K" || number=="Q") {
			this.number=number;
		}
		else {
			System.out.println("Error. You can't create a card with an out of range value.");
			this.number="0";
		}
		if(suit == "Spade" || suit == "Diamond" || suit == "Clubs" || suit == "Heart") {
			this.suit=suit;
		}
		else {
			System.out.println("Error. You can't create a card with a different color than the standard ones.");
			this.number="0";
		}
		
	}
	
	public String getCardNumber() {
		return this.number;
	}
	
	public String getCardSuit() {
		return this.suit;
		
	}
	public int compare(Comparable objectToCompare) {
		if(objectToCompare instanceof Card) {
			/*if(this.number=="0") {
				return 0;
			}*/
			if(this.number==((Card)objectToCompare).number)
				if(this.suit==((Card)objectToCompare).suit) {
						return 0;
					}
				else {
					return 1;
				}
			else {
					if(nrs.contains(((Card)objectToCompare).number)) {
						if(nrs.contains(this.number)) {
							if(this.number=="10") {
								return 2;
							}
							if(((Card)objectToCompare).number=="10") {
								return -1;
							}
							if(this.number.compareTo(((Card)objectToCompare).number)>0){
								return 2;
							}
							else
								return -1;
						}
						else {
							return 2;
						}
							
					}
					else
					{
						if(nrs.contains(this.number)) {
							return -1;
						}
						if(((Card)objectToCompare).number=="A") {
							return -1;
						}
						if(((Card)objectToCompare).number=="K" && (this.number=="Q" || this.number=="J")) {
							return -1;
						}
						if(((Card)objectToCompare).number=="Q" && this.number=="J") {
							return -1;
						}
						return 2;
					}
			}
		}
		return 0;
	}
}
