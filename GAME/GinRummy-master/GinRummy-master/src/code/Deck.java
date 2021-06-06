package code;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Card> deckStack = new ArrayList<>();
    private String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "m", "n", "o", "p"};
    private String[] suits = {"c", "d", "h", "s"};

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        deckStack.clear();
        for (int suit = 0; suit < this.suits.length; suit++) {
            for (int rank = 0; rank < this.ranks.length; rank++) {
                String s = suits[suit];
                String r = ranks[rank];
                Card newCard = new Card(s, r);
                deckStack.add(newCard);
            }
        }
    }

    public Card getCard(int index) {
        return deckStack.get(index);
    }

    public ArrayList<Card> getStore() {
        return this.deckStack;
    }

    public void deckShuffle() {
        // Fisher-Yates Shuffle Algorithm
        Random randomNumber = new Random();
        for (int i = deckStack.size() - 1; i > 0; i--) {
            int randomIndex = randomNumber.nextInt(i + 1);
            Card a = deckStack.get(randomIndex);
            Card b = deckStack.get(i);
            deckStack.set(randomIndex, b);
            deckStack.set(i, a);
        }
    }

    public final void refill() {
        deckStack.clear();
        for (int suit = 0; suit < this.suits.length; suit++) {
            for (int rank = 0; rank < this.ranks.length; rank++) {
                String s = suits[suit];
                String r = ranks[rank];
                Card newCard = new Card(s, r);
                deckStack.add(newCard);
            }
        }
    }

    public Card drawCard() {
        Card card = null;
        while (card == null) {
            int index = (int) (Math.random() * deckStack.size());
            card = deckStack.get(index);
            deckStack.remove(index);
        }
        return card;
    }
}
