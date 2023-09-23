
public class Main {
    public static void part1(){
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }
    
    public static void part2(){
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        Package gifts = new Package();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
    public static void main(String[] args) {


        // use this main method to try out your classes!
        //part1();
        part2();
    }
}
