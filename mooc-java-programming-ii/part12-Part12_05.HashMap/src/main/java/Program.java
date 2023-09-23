
import java.util.Scanner;

public class Program {

    public static void part1Pair(){
        Pair<String, Integer> pair = new Pair<>("one", 1);
        System.out.println(pair.getKey() + " -> " + pair.getValue());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        part1Pair();

    }

}
