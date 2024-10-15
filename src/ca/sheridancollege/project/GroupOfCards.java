/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupOfCards {
    private ArrayList<Card> cards;
    private int size;

    public GroupOfCards(int size) {
        this.size = size;
        this.cards = new ArrayList<>();
        initializeCards();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private void initializeCards() {
        List<String> baseSymbols = Arrays.asList("Moon", "Star", "Sun", "Tree", "Apple", "House", "Car", "Fish", "Dog", "Cat", "Bird", "Boat", "Plane", "Ball", "Chair", "Table");
        
        int cardSymbolsCount = 3; 
        int cardCount = this.size; 

        for (int i = 0; i < cardCount; i++) {
            Collections.shuffle(baseSymbols);
            List<String> cardSymbols = new ArrayList<>(baseSymbols.subList(0, cardSymbolsCount)); // Pick first 3 symbols for the card
            this.cards.add(new SpotItCard(cardSymbols));
        }
    }
}
