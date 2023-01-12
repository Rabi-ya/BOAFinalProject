package boaFinalProject;

//represent the cards the player and the dealer are holding, and get the total value of the cards in their hand
import java.util.ArrayList;

public class Hand {
    //** private instance variable making an ArrayList of Cards
    private ArrayList<Card> hand;

    //this constructor creates an empty hand, and assigns it to the hand variable we just created
    public Hand(){
        hand = new ArrayList<Card>();
    }

    //this method draws a card from the deck to this hand, assuming we have a method in the Deck class called DrawCard
    public void takeCardFromDeck(Deck deck){
        hand.add(deck.takeCard());
    }

    //we need to print the dealer's/player's current hand
    //The method iterates through the arraylist of Card objects called HAND and concatenates the toString
    // representation of each card in the hand array
    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + " - ";
        }
        return output;
    }

    // we need a method to calculate the value of the hand
    public int calculatedValue(){

        //variable to count number of aces, and current total value
        int value = 0;
        int aceCount = 0;

        //For each card in this hand
        for(Card card: hand){
            //Add the card value to the hand
            value += card.getValue();
            //Count how many aces have been added
            if (card.getValue() == 11){
                aceCount ++;
            }
        }

        //aces are tricky???
        if (value > 21 && aceCount > 0){
            while(aceCount > 0 && value > 21){
                aceCount --;
                value -= 10;
            }
        }

        return value;

    }

    // this method will let us get the first card from the dealers hand & returns the element at the given index of the list
    public Card getCard(int idx){

        return hand.get(idx);
    }



}
