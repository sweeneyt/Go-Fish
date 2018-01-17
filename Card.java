public class Card {
    String suit;
    int number;

    Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }
}
