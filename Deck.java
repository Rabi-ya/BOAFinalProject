import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;

    /**
     * CONSTRUCTOR THAT CREATES AN EMPTY ARRAYLIST OF CARDS
     */
    public Deck(){
        deck = new ArrayList<Card>();
    }

    /**
     * OVERLOADED CONSTRUCTOR THAT ADDS ALL 52 CARDS TO THE DECK BY ITERATING THROUGH ALL SUITS AND ALL RANKS
     * @param makeDeck
     */
    public Deck(boolean makeDeck){
        deck = new ArrayList<Card>();
        if (makeDeck){
            //go through all the suits
            for (Suit suit : Suit.values()){
                //go through all the ranks
                for (Rank rank : Rank.values()){
                    //add a new card containing each iteration's suit and rank
                    deck.add(new Card(suit, rank));
                }
            }
        }
    }

    /**
     * add() METHOD TO ADD A SINGLE CARD TO THE DECK
     * @param card
     */
    public void addCard(Card card){
        deck.add(card);
    }

    /**
     * toString() METHOD
     * @return  A STRING CONTAINING EVERY SINGLE CARD IN THE DECK
     */
    public String toString(){
        //a string to hold everything we're going to return
        String output = "";

        //for each Card "card" in the deck
        for (Card card : deck){
            //add the card and the escape character for a new line
            output += card;
            output += "\n";

        }
        return output;
    }

    /**
     * METHOD TO SHUFFLE THE DECK
     */
    public void shuffle(){
        Collections.shuffle(deck, new Random());
    }

    /**
     * METHOD TO TAKE CARD FROM THE DECK
     * @return  TOP OF THE CARD FROM THE DECK
     */
    public Card takeCard(){
        //take a copy of the first card from the deck
        Card cardToTake = new Card(deck.get(0));
        //remove the card from the deck
        deck.remove(0);
        //give the card back
        return cardToTake;
    }

    /**
     * METHOD THAT MAKES SURE THE DECK WE'RE TAKING FROM HAS CARDS IN IT
     * @return TRUE IF THE DECK HAS 1 OR MORE CARDS LEFT
     */
    public boolean hasCards(){
        if (deck.size()>0){
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * EMPTIES OUT THIS DECK
     */
    public void emptyDeck(){
        deck.clear();
    }

    /**
     * AN ARRAYLIST OF CARDS TO BE ADDED TO THIS DECK
     * @param cards
     */
    public void addCards(ArrayList<Card> cards){
        deck.addAll(cards);
    }

    /**
     * TAKE ALL THE CARDS FROM A DISCARDED DECK AND PLACE THEM IN THIS DECK SHUFFLED
     * CLEAR THE OLD DECK
     * @param discard   THE DECK WE'RE GETTING THE CARDS FROM
     */
    public void reloadDeckFromDiscard(Deck discard){
        this.addCard(discard.getCards());
        this.shuffle();
        discard.emptyDeck();
        System.out.println("Ran out of cards, creating a new deck from discard pile and shuffling deck.");
    }

    /**
     * METHOD
     * @return THE AMOUNT OF CARDS LEFT IN THE DECK
     */
    public int cardsLeft(){
        return deck.size();
    }
}
