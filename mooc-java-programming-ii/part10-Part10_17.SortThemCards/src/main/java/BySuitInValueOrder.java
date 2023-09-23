/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    public int compare(Card c1, Card c2){
        
        
        if (c1.getSuit() != c2.getSuit()) {
            // If suits are different, compare based on suits
            return c1.getSuit().compareTo(c2.getSuit());
        } else {
            // If suits are the same, compare based on values
            return c1.getValue() - c2.getValue();
        }
    }
}
