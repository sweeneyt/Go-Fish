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
        while(game.goDeck.size() > 0) {
            playersTurn(game, human, computer);
            if(game.goDeck.size() > 0)
                playersTurn(game, computer, human);
        }
        declareWinner(human, computer);
    }

    public static void firstDraw(Deck game, Human human, Computer computer){
            human.addCardToHand(game.draw(CARDS_TO_START));
            computer.addCardToHand(game.draw(CARDS_TO_START));
    }

    public static void playersTurn(Deck game, Player player, Player opponent){
        int cardNum;
        if(player.countNumberInHand() == 0){
            player.addCardToHand(game.draw(CARDS_TO_START));
        }
        do{
            cardNum = getCardNumFromPlayer(player);
        }while(!player.checkHand(cardNum));
        System.out.println(cardNum + " has been requested");
        if(opponent.checkHand(cardNum))
            handOverCards(player, opponent, cardNum);
        else
            cardNum = goFish(player, game);
        if(player.isASet(cardNum)) {
            player.moveCardsToSetList(cardNum);
            System.out.println("Player got a set of " + cardNum);
        }
        player.viewHand();
    }

    public static void declareWinner(Human human, Computer computer){
        int humanNum = human.countSets();
        int compNum = computer.countSets();
        System.out.println("You have " +humanNum+ " sets");
        System.out.println("Computer has " +compNum+ " sets");
        if(humanNum > compNum)
            System.out.println("YOU WIN!!!");
        else if(compNum > humanNum)
            System.out.println("COMPUTER WINS!!");
        else
            System.out.println("ITS A TIE");
    }


    public static int getCardNumFromPlayer(Player player){
        if(player instanceof Human) {
            System.out.println("Ask Computer for: ");
            return scanner.nextInt();
        }
        else{
            return randomlySelectCard();
        }
    }

    public static int goFish(Player player, Deck game){
        System.out.println("GO FISH!");
        Card cardFished = game.draw();
        player.addCardToHand(cardFished);
        return cardFished.getNumber();
    }

    public static void handOverCards(Player playerToReceive, Player playerToGive, int cardNumber){
        ArrayList<Card> cardsToMoveHands = playerToGive.removeCards(cardNumber);
        playerToReceive.addCardToHand(cardsToMoveHands);
        System.out.println("You obtained " + cardsToMoveHands.size() + " - " +cardNumber + " from your opponent");
    }

    public static int randomlySelectCard(){
        return (int)(Math.random()*13)+1;
    }
}
