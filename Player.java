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
        System.out.println("You fetched a " +card.getNumber());
        hand[card.getNumber()].add(card);
    }

    public void addCardToHand(ArrayList<Card> cardsToAdd){
        for(int i =0; i<cardsToAdd.size(); i++) {
            int cardNumber = cardsToAdd.get(i).getNumber();
            hand[cardNumber].add(cardsToAdd.get(i));
        }
    }

    public void moveCardsToSetList(int cardNumber){
        sets.add(cardNumber);
        hand[cardNumber].clear();
    }

    protected abstract void addCardToSets(Integer cardNumber);
    protected abstract void viewHand();

    public boolean isASet(int cardNumber) {
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

    public int countNumberInHand(){
        int count = 0;
        for(int i = 0; i < 14; i++){
            count += hand[i].size();
        }
        return count;
    }

}
