
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
        
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 2.50;
        if (payment >= price){
            this.money += price;
            this.affordableMeals++;
            return payment - price;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double price = 4.30;
        if (payment >= price){
            this.money += price;
            this.heartyMeals++;
            return payment - price;
        }
        return payment;
    }
    
     public boolean eatAffordably(PaymentCard card) {

        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        //  card payments don't increase the amount of cash in the register
        double price = 2.50;
        if (card.balance() >= price){
            
            this.affordableMeals++;
            return card.takeMoney(price);
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        //  card payments don't increase the amount of cash in the register
        double price = 4.30;
         if (card.balance() >= price){
            
            this.heartyMeals++;
            return card.takeMoney(price);
        }
        
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if ( sum >= 0){
            // this is for client cards.
            card.addMoney(sum);
            
            // we need to add more cash in the terminal
            // so that we we have enough cash for changes.
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
