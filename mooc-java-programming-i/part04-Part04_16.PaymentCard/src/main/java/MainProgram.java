
public class MainProgram {
    /*
    public static void part1(PaymentCard card){
        System.out.println(card);
    }
    
    public static void part2(PaymentCard card){
        card.eatAffordably();
        part1(card);
        
        card.eatHeartily();
        card.eatAffordably();
        part1(card);
    }
    
    public static void part3(PaymentCard card){
        
        part1(card);
        
        card.eatHeartily();
        part1(card);
        
        card.eatHeartily();
        part1(card);
    }
    
    public static void part4(PaymentCard card){
        part1(card);
        
        card.addMoney(15);
        part1(card);

        card.addMoney(10);
        part1(card);

        card.addMoney(200);
        part1(card);
    }
    
    public static void part5(PaymentCard card) {
        
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
    }
    */
    public static void part6(){
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        
        System.out.println("Paul: "+paulCard);
        System.out.println("Matt: "+mattCard);
        
        // tops up 20 euros for paul
        paulCard.addMoney(20);
        mattCard.eatHeartily();
        
        System.out.println("Paul: "+paulCard);
        System.out.println("Matt: "+mattCard);
        
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        
        System.out.println("Paul: "+paulCard);
        System.out.println("Matt: "+mattCard);
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        /*
        PaymentCard card = new PaymentCard(50);
        
        part1(card);
        part2(card);
        
        PaymentCard part3Card = new PaymentCard(5);
        part3(part3Card);
        
        PaymentCard part4Card = new PaymentCard(10);
        part4(part4Card);
        
        PaymentCard part5Card = new PaymentCard(10);
         part5(part5Card);
        */
        part6();
         
        
    }
}
