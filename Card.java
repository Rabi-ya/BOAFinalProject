public class Card {

    //VARIABLES
    private Suit suit;
    private Rank rank;

    /**
     * CREATE A CARD GIVEN A SUIT AND A RANK
     * @param suit    THE SUIT OF THE CARD
     * @param rank    THE RANK OF THE CARD
     */
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    /** GETTER METHOD
     @return   RANK VALUE
     */
    public int getValue(){
        return rank.rankValue;
    }

    /** GETTER METHOD
     @return   SUIT
     */
    public Suit getSuit(){
        return suit;
    }

    /** GETTER METHOD
     @return   RANK
     */
    public Rank getRank(){
        return rank;
    }

    /**
     * toString METHOD
     * @return  A String REPRESENTATION OF THE CARD WITH ITS SUIT, RANK AND VALUE ALL IN ONE
     */
    public String toString(){
        return ("[" + rank + " of " + suit + "] (" + this.getValue() + ")");
    }


    public Card(Card card){
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }
}
