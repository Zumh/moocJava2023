
public class Main {

    public static void part1(Apartment manhattanStudioApt, Apartment atlantaTwoBedroomApt, Apartment bangorThreeBedroomApt){
        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));
    }
    
    
    public static void part2(Apartment manhattanStudioApt, Apartment atlantaTwoBedroomApt, Apartment bangorThreeBedroomApt){
        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   // true
    }
    
    public static void part3(Apartment manhattanStudioApt, Apartment atlantaTwoBedroomApt, Apartment bangorThreeBedroomApt){
        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
    }
    
    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        
        //part1(manhattanStudioApt, atlantaTwoBedroomApt, bangorThreeBedroomApt);
        //part2(manhattanStudioApt, atlantaTwoBedroomApt, bangorThreeBedroomApt);
        part3(manhattanStudioApt, atlantaTwoBedroomApt, bangorThreeBedroomApt);
    }
}
