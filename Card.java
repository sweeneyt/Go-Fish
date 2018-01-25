public class Card {
    String suit;
    Integer number;

    Card(String suit, Integer number){
        this.suit = suit;
        this.number = number;
    }

    public Integer getNumber() { return number;}

    public String getSuit() {
        return suit;
    }
}
