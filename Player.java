import java.util.ArrayList;

public abstract class Player {
    ArrayList<Card> hand;
    ArrayList<Card> pairs;
    int numberOfPairs;

    Player(){
        this.hand = new ArrayList<>();
        this.pairs = new ArrayList<>();
        this.numberOfPairs = 0;
    }


    public void addCardToHand(Card card){
        hand.add(card);
    }
 

}
