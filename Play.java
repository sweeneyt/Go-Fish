import java.util.Scanner;
import java.util.ArrayList;

public class Play {

    public static Scanner scanner = new Scanner(System.in);
    public static final int CARDS_TO_START = 5;

    public static void main(String argv[]){
        Deck game = new Deck();
        Human human = new Human();
        Computer computer = new Computer();
        firstDraw(game, human, computer);
        human.viewHand();
        askOpponentForCard(game,human,computer);
    }

    public static void firstDraw(Deck game, Human human, Computer computer){
        for(int i=0; i<CARDS_TO_START; i++){
            human.addCardToHand(game.draw());
        }
        for(int i=0; i<CARDS_TO_START; i++){
            computer.addCardToHand(game.draw());
        }
    }

    public static void askOpponentForCard(Deck game, Human human, Computer computer){
        int cardNumber;
        do {
            System.out.println("Ask for card: ");
            cardNumber = scanner.nextInt();
        }while(!human.checkHand(cardNumber));
        if(computer.checkHand(cardNumber))
            switchCards(human, computer, cardNumber);
        else
            human.addCardToHand(game.draw());
        human.viewHand();
    }

    public static void switchCards(Player playerToReceive, Player playerToGive, int cardNumber){
        ArrayList<Card> cardsToMoveHands = playerToGive.removeCards(cardNumber);
        playerToReceive.addCardToHand(cardsToMoveHands);
    }
}
