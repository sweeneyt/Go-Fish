public class Play {

    public static final int CARDS_TO_START = 8;

    public static void main(String argv[]){
        Deck game = new Deck();
        Human human = new Human();
        Computer computer = new Computer();
        firstDraw(game, human, computer);
        human.viewHand();
    }

    public static void firstDraw(Deck game, Human human, Computer computer){
        for(int i=0; i<CARDS_TO_START; i++){
            human.addCardToHand(game.draw());
        }
        for(int i=0; i<CARDS_TO_START; i++){
            computer.addCardToHand(game.draw());
        }
    }
}
