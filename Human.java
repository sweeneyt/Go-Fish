public class Human extends Player{

    public void viewHand() {
        System.out.println("Player Hand: ");
        for(int i = 0; i < hand.size(); i++) {
            System.out.print(hand.get(i).getSuit()+hand.get(i).getNumber()+" ");
        }
    }

}
