import java.util.ArrayList;
import java.lang.Math;

public class Deck {
    ArrayList<Card> goDeck;

    Deck(){
        this.goDeck = new ArrayList<>();
        addCards();
    }

    public void addCards(){
        addSuit("Diamond");
        addSuit("Spade");
        addSuit("Heart");
        addSuit("Club");
    }

    public void addSuit(String suit){
        for(int i=1; i<14; i++){
            Card aCard = new Card(suit, i);
            goDeck.add(aCard);
        }
    }

    public void viewDeck(){
        for(int i=0; i < goDeck.size(); i++){
            System.out.print(goDeck.get(i).getSuit()+goDeck.get(i).getNumber() +" ");
        }
    }

    public Card draw(){
        int locationOfCard = (int)(Math.random()*(goDeck.size()));
        Card cardDrawn = goDeck.get(locationOfCard);
        goDeck.remove(locationOfCard);
        return cardDrawn;
    }

    public ArrayList<Card> draw(int numberOfCards){
        ArrayList<Card> cardsDrawn = new ArrayList<>();
        for(int i=0; i<numberOfCards; i++) {
            int locationOfCard = (int) (Math.random() * (goDeck.size()));
            cardsDrawn.add(goDeck.get(locationOfCard));
            goDeck.remove(locationOfCard);
        }
        return cardsDrawn;
    }
}