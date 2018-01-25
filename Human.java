public class Human extends Player{

    public void viewHand() {
        System.out.print("Player Hand: ");
        for(int i = 0; i < 14; i++) {
            if(hand[i].size() >= 1)
                for (Card card:hand[i]) {
                    System.out.print(card.getSuit() + card.getNumber() + " ");
                }

        }
        System.out.println();
    }

    public void moveCardsToSetList(int cardNumber){
        sets.add(cardNumber);
        hand[cardNumber].clear();
        System.out.println("You got a set of " + cardNumber);
        printSets();
    }

    public void printSets(){
        System.out.print("Your pairs: ");
        for (int i = 0; i<sets.size(); i++) {
            System.out.print(sets.get(i) + " ");
        }
        System.out.println();
    }

}
