public class Computer extends Player {

    public void addCardToHand(Card card){
        hand[card.getNumber()].add(card);
    }

    public void addCardToSets(Integer cardNumber){
        System.out.println("You got a set of " + cardNumber + "s");
        sets.add(cardNumber);
        printPairs();
    }

    public void printPairs(){
        System.out.println("Your pairs: ");
        for (int number:sets) {
            System.out.print(sets.get(number));
        }
    }

    public void viewHand(){
        System.out.println("Computer has " + countNumberInHand() + " cards");
    }


}
