public class Computer extends Player {

    public void addCardToHand(Card card){
        hand[card.getNumber()].add(card);
    }

    public void moveCardsToSetList(int cardNumber){
        sets.add(cardNumber);
        hand[cardNumber].clear();
        System.out.println("Computer got a set of " + cardNumber);
        printSets();
    }

    public void printSets(){
        System.out.print("Computer pairs: ");
        for (int i = 0; i<sets.size(); i++) {
            System.out.print(sets.get(i) + " ");
        }
        System.out.println();
    }

    public void viewHand(){
        System.out.println("Computer has " + countNumberInHand() + " cards");
    }


}
