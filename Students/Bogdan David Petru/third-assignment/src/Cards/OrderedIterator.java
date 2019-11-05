package Cards;
import sorting.Comparable;
public class OrderedIterator extends IteratorClass{

	public OrderedIterator() {
		super();
	}
	public int put(Comparable comparable) {
		if(comparable instanceof Card) {
			if(((Card)comparable).getCardNumber()=="0") {
				System.out.println("Error. Can't add a card which is not properly initialised.");
				return -1;
			}
			if(this.dimension==0) {
				cards[0]=((Card)comparable);
				this.dimension++;
				return 0;
			}
			if(exists(comparable)) {
				return -1;
			}
			int i=0;
			while(i<this.dimension && cards[i].compare(comparable)<0) {
				i++;
			}
			if(i==this.dimension) {
				cards[dimension++]=((Card)comparable);
				return dimension;
			}
			for(int j=dimension++;j>i;j--) {
				cards[j]=cards[j-1];
			}
			cards[i]=((Card)comparable);
			return i;
		}
			System.out.println("Error. You can't add other objcets than cards.");
			return -1;
	}
	
	public boolean exists(Comparable comparable) {
		if(comparable instanceof Card) {
			int dim=this.getDimension();
			for(int i=0;i<dim;i++) {
				if(cards[i].compare(comparable)==0)
				{
					System.out.println("Card already exists or card is not initialised correctly.");
					return true;
				}
					
			}
			return false;
		}
		return false;
	}
	public void printCards() {
		for(int i=0;i<this.dimension;i++) {
			System.out.println("Card number " + cards[i].number + " suit: " + cards[i].suit + "\n");
		}
	}
}
