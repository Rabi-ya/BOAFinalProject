package boaFinalProject;

/**
 * ENUM CONTAINING THE SUITS OF A CARD
 */
public enum Suit {

    CLUB("Clubs"),
    DIAMONDS("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;

    /**
 * CONSTRUCTOR FOR SUIT
 * @param suitName
 */
    Suit(String suitName){
        this.suitName = suitName;
    }

/**
 * toString METHOD
 * @return  THE NAME OF THE SUIT
 */
    public String toString() {
        return suitName;
    }
}

