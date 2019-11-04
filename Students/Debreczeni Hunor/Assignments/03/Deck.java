import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck implements OrderedIterator<Card>, Comparable {

    private List<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
    }

    public Deck(Boolean fill) {
        if (fill) {
            cards = new ArrayList<>(
                    Arrays.asList(
                            new Card("Spades", "2"),
                            new Card("Clubs", "2"),
                            new Card("Hearts", "2"),
                            new Card("Diamonds", "2"),
                            new Card("Spades", "3"),
                            new Card("Clubs", "3"),
                            new Card("Hearts", "3"),
                            new Card("Diamonds", "3"),
                            new Card("Spades", "4"),
                            new Card("Clubs", "4"),
                            new Card("Hearts", "4"),
                            new Card("Diamonds", "4"),
                            new Card("Spades", "5"),
                            new Card("Clubs", "5"),
                            new Card("Hearts", "5"),
                            new Card("Diamonds", "5"),
                            new Card("Spades", "6"),
                            new Card("Clubs", "6"),
                            new Card("Hearts", "6"),
                            new Card("Diamonds", "6"),
                            new Card("Spades", "7"),
                            new Card("Clubs", "7"),
                            new Card("Hearts", "7"),
                            new Card("Diamonds", "7"),
                            new Card("Spades", "8"),
                            new Card("Clubs", "8"),
                            new Card("Hearts", "8"),
                            new Card("Diamonds", "8"),
                            new Card("Spades", "9"),
                            new Card("Clubs", "9"),
                            new Card("Hearts", "9"),
                            new Card("Diamonds", "9"),
                            new Card("Spades", "10"),
                            new Card("Clubs", "10"),
                            new Card("Hearts", "10"),
                            new Card("Diamonds", "10"),
                            new Card("Spades", "Jack"),
                            new Card("Clubs", "Jack"),
                            new Card("Hearts", "Jack"),
                            new Card("Diamonds", "Jack"),
                            new Card("Spades", "Queen"),
                            new Card("Clubs", "Queen"),
                            new Card("Hearts", "Queen"),
                            new Card("Diamonds", "Queen"),
                            new Card("Spades", "King"),
                            new Card("Clubs", "King"),
                            new Card("Hearts", "King"),
                            new Card("Diamonds", "King"),
                            new Card("Spades", "Ace"),
                            new Card("Clubs", "Ace"),
                            new Card("Hearts", "Ace"),
                            new Card("Diamonds", "Ace"),
                            new Card("Black", "Joker"),
                            new Card("Red", "Joker")
                    ));
        }else{
            cards = new ArrayList<>();
        }
    }

    @Override
    public boolean hasNext() {
        return !cards.isEmpty();
    }

    @Override
    public Card next() throws IllegalStateException {
        if (hasNext()) {
            Card response = cards.get(0);
            this.remove();
            return response;
        } else {
            throw new IllegalStateException("Deck.next(): Deck is empty.");
        }
    }

    @Override
    public void remove() {
        cards.remove(0);
    }

    @Override
    public int put(Object obj) throws IllegalArgumentException {
        if (obj instanceof Card) {
            if (this.compareTo(obj) == 0) {
                cards.add((Card) obj);
                return 1;
            }
            return 0;
        } else {
            throw new IllegalArgumentException("Deck.put(*obj*): Wrong object type to be inserted.");
        }
    }


    /**
     *  I didn't understand how should a compare function tell us if an object exists or not, so I used the function
     *  as if it was a checkIfExists function.
     *
     * @param object  Object to check if exists in the Deck
     * @return  True if exists, 0 otherwise
     * @throws IllegalArgumentException If object from arguments isn't in instance of the Object type in the Deck
     */
    @Override
    public int compareTo(Object object) throws IllegalArgumentException {
        if (object instanceof Card) {
            if (cards.contains(object)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            throw new IllegalArgumentException("Deck.compareTo(*obj*): Wrong object type to be compared with.");
        }
    }

    public int size(){
        return cards.size();
    }
}
