public class MainClass {
    public static void main(String[] args) {
        Deck deck = new Deck(true);
        Card newCard = new Card("Black", "11");
        deck.put(newCard);
        deck.put(newCard);
        while (deck.hasNext()) {
            Card card = deck.next();
            System.out.println(card.getSuit() + " " + card.getNumber());
        }
    }
}
