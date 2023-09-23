
import java.util.Scanner;

public class Program {
    public static void part1(){
        /*
        false
        true
        peekaboo
        false
        true
        heelloo
        false
        */
        Hideout<String> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout("peekaboo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        den.putIntoHideout("toodaloo");
        den.putIntoHideout("heelloo");
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
    }
    
    public static void part2(){
        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        //part1();
        part2();
    }
}
