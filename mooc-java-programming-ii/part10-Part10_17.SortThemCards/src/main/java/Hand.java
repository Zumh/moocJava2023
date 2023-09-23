/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Hand  implements Comparable<Hand> {
    private List<Card> cards;
    public Hand(){
        this.cards = new ArrayList<>();
    }
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        this.cards.forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        
        Collections.sort(cards);
    }
    
    public List<Card> getCard(){
        return this.cards;
    }
   
    @Override
    public int compareTo(Hand hand){
       // calculate both sum of values 
       int thisCardSumValues = this.cards.stream().map(card -> card.getValue()).reduce(0, (acc, number)-> acc + number);
       int handCardSumValues = hand.getCard().stream().map(card -> card.getValue()).reduce(0, (acc, number)-> acc + number);
       
       if(thisCardSumValues > handCardSumValues){
           return 1;
       } else if (thisCardSumValues < handCardSumValues){
           return -1;
       }
       return 0;
    }
    
    public void sortBySuit(){
         
        Collections.sort(this.cards, (c1, c2) -> {
            
            if (c1.getSuit() != c2.getSuit()) {
                return c1.getSuit().compareTo(c2.getSuit());
            }
            return c1.getValue() - c2.getValue();
        });
        
    }
            
}
