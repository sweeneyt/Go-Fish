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

    public void addCardToHand(ArrayList<Card> cardsToAdd){
        hand[cardsToAdd.get(0).getNumber()].addAll(cardsToAdd);
        System.out.println("You obtained " + cardsToAdd.size() + " " +cardsToAdd.get(0).getNumber());
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

    public boolean checkHand(int cardNumber){
        if(hand[cardNumber].size() >= 1)
            return true;
        else
            return false;
    }

    public ArrayList<Card> removeCards(int cardNumber){
        ArrayList<Card> cardsToMove = new ArrayList<Card>();
        cardsToMove.addAll(hand[cardNumber]);
        hand[cardNumber].clear();
        return cardsToMove;
    }

}
