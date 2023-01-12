package boaFinalProject;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Blackjack. Rule for this game:\n" +
                "********************************************************************************************************************************************************** \n" +

        "- Players start with two cards and have an option to hit (draw another card) or stand (end their turn) \n" +
                "- Number cards are valued at their number, Face cards (Jack, Queen, and King) are valued at 10, and aces are valued at 1 or 11 depending on the situation \n" +
                "- If the value of the hand with an ace puts it over 21, the ace is valued at 1. If it's doesn't, it's 11. \n" +
                "  So, for example, a King and an ace would be 21, but one King, a 9, and an Ace would be valued at 20 (10+9+1=20). \n" +
                "- If the Player starts with 21, they automatically get BlackJack and win. If the dealer starts with 21,  \n" +
                "  the player loses automatically, before they even get a chance to hit or stand. If they both get 21 in the end, it's a push (a draw or tie).  \n" +
                "- The player may stand (stop drawing) at any time. If they go over 21 they bust and lose.   \n" +
                "  When the player stands, it's the end of their turn, and the dealer begins drawing their third, fourth, fifth card, and so on.  \n" +
                "- If neither player nor dealer busts or gets BlackJack, the player with the highest score wins the round.\n" +
                "- The dealer will keep drawing cards until they reach a hand valued at 17 or higher.    \n" +
        "**********************************************************************************************************************************************************");

        //Create and start the Game
        Game blackjack = new Game();


    }
}
