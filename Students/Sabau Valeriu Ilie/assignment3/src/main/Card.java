package main;

public class Card implements Comparable<Card> {
    public char suit;
    public char number;

    private String numberOrder="23456789JQKA";
    private String suitOrder="CHSD";//clubs hearts spades diamonds


    public Card(char suit, char number)
    {
        this.number=number;
        this.suit=suit;
    }

    public String toString()
    {
        String aux=suit+" " + number;
        return aux;
    }

    public boolean isValid()
    {
        return suitOrder.indexOf(suit) != -1 && numberOrder.indexOf(number) != -1;
    }

    @Override
    public int compareTo(Card cardToCompareTo) {

        if(cardToCompareTo==null)
            return 0;

        if(this.number==cardToCompareTo.number)
        {
            Integer index1=suitOrder.indexOf(this.suit);
            Integer index2=suitOrder.indexOf(cardToCompareTo.suit);
            return index1.compareTo(index2);
        }
        Integer index1=numberOrder.indexOf(this.number);
        Integer index2=numberOrder.indexOf(cardToCompareTo.number);
        return index1.compareTo(index2);
    }


}
