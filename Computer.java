public class Computer extends Player {

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
