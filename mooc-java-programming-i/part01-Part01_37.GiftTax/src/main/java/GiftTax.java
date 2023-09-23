
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int givenGift = Integer.valueOf(scan.nextLine());
        double taxRateEx = 0.00;
        int taxLowerLimit = 0;
        int valueOfGift = 0;
        
        if (givenGift >= 5000 && givenGift < 25000){
            taxRateEx = (8.0/100);
            taxLowerLimit = 100;
            valueOfGift = 5000;
            
        } else if (givenGift >= 25000 && givenGift < 55000){
            taxRateEx = (10.0/100);
            taxLowerLimit = 1700;
            valueOfGift = 25000;
            
        } else if (givenGift >= 55000 && givenGift < 200000){
            taxRateEx = (12.0/100);
            taxLowerLimit = 4700;
            valueOfGift = 55000;
            
        } else if (givenGift >= 200000 && givenGift < 1000000){
            taxRateEx = (15.0/100);
            taxLowerLimit = 22100;
            valueOfGift = 200000;
        } else if (givenGift >= 1000000){
            taxRateEx = (17.0/100);
            taxLowerLimit = 142100;
            valueOfGift = 1000000;
        }
    
        double finalDeductableGiftTax = (taxLowerLimit + (givenGift - valueOfGift) * taxRateEx);
        if (finalDeductableGiftTax > 0){
            System.out.println("Tax: " + finalDeductableGiftTax);
        } else {
            System.out.println("No tax!");
        }
        
    }
}
