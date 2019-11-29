package assignment_03.cards;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private final Suit suit;
    private final Number number;

    public Card(Suit suit, Number number) {
        this.suit = Objects.requireNonNull(suit);
        this.number = Objects.requireNonNull(number);
    }

    public Suit getSuit() {
        return suit;
    }

    public Number getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card card) {
        int result = suit.compareTo(card.suit);
        if (result == 0) {
            return number.compareTo(card.number);
        } else {
            return result;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Card))
            return false;
        Card card = (Card) obj;
        return suit == card.suit &&
                number == card.number;
    }

    @Override
    public String toString() {
        return suit.toString() + number.toString();
    }

    public enum Suit {
        DIAMONDS("♦"),
        CLUBS("♣"),
        HEARTS("♥"),
        SPADES("♠");

        private final String symbol;

        Suit(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }

    public enum Number {
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("J"),
        QUEEN("Q"),
        KING("K"),
        ACE("A");

        private String abbreviation;

        Number(String s) {
            this.abbreviation = s;
        }

        @Override
        public String toString() {
            return abbreviation;
        }
    }
}
