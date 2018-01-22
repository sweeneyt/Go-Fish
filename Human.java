public class Human extends Player{

    public void viewHand() {
        System.out.println("Player Hand: ");
        for(int i = 0; i < 14; i++) {
            if(hand[i].size() >= 1)
                for (Card card:hand[i]) {
                    System.out.print(card.getSuit() + card.getNumber() + " ");
                }

        }
    }

    public void addCardToSets(Integer cardNumber){
        System.out.println("You got a pair of " + cardNumber + "s");
        sets.add(cardNumber);
        printPairs();
    }

    public void printPairs(){
        System.out.println("Your pairs: ");
        for (int number:sets) {
            System.out.print(sets.get(number));
        }
    }

}
