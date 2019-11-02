import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeckTest {

    private Deck filledDeck;
    private Deck emptyDeck;

    @BeforeEach
    void setUp() {
        filledDeck = new Deck(true);
        emptyDeck = new Deck();
        Assert.assertNotNull(filledDeck);
        Assert.assertNotNull(emptyDeck);
    }

    @Test
    void hasNext() {
        Assert.assertTrue(filledDeck.hasNext());
        Assert.assertFalse(emptyDeck.hasNext());
    }

    @Test
    void next() {
        Card card = new Card("Black", "Joker");
        emptyDeck.put(card);
        Assert.assertEquals(card, emptyDeck.next());
    }

    @Test
    void remove() {
        int numberOfCardsInDeck = filledDeck.size();
        filledDeck.remove();
        Assert.assertEquals(numberOfCardsInDeck - 1, filledDeck.size());
    }

    @Test
    void put() {
        Card card = new Card("Black", "Joker");
        int numberOfCardsInDeck = emptyDeck.size();
        emptyDeck.put(card);
        Assert.assertEquals(numberOfCardsInDeck + 1, emptyDeck.size());
        emptyDeck.put(card);
        Assert.assertEquals(numberOfCardsInDeck + 1, emptyDeck.size());

    }

    @Test
    void compareTo() {
        Card cardOne = new Card("Red", "Joker");
        Card cardTwo = new Card("Black", "Joker");
        emptyDeck.put(cardOne);
        Assert.assertEquals(1,emptyDeck.compareTo(cardOne));
        Assert.assertEquals(0,emptyDeck.compareTo(cardTwo));
    }

    @AfterEach
    void tearDown() {
        filledDeck = null;
    }
}