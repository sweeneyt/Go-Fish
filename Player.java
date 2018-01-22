import java.util.ArrayList;

public abstract class Player {
    CardSetsList[] hand;
    ArrayList<Integer> sets;
    int numberOfPairs;

    Player(){
        this.hand = new CardSetsList[14];
        this.sets = new ArrayList<>();
        this.numberOfPairs = 0;
        initHand();
    }


    public void addCardToHand(Card card){
        System.out.println(card.getNumber());
        hand[card.getNumber()].add(card);
    }

    protected abstract void addCardToSets(Integer cardNumber);

    public boolean isASet(Integer cardNumber) {
        if(hand[cardNumber].size() == 4)
            return true;
        else
            return false;
    }

    private void initHand(){
        for(int i = 0; i < hand.length; i++){
            hand[i] = new CardSetsList();
        }
    }

}
