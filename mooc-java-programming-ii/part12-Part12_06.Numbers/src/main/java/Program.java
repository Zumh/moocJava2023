
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomNumber = new Random();
        int currentRandom  = 0;
        
        System.out.println("How many random numbers hould be printed?");
        int number = Integer.valueOf(scanner.nextLine());
        
        for(int count = 0; count < number; count++){
            // generate random number between 0 - 10
            currentRandom = randomNumber.nextInt(11);
            // print generated number
            System.out.println(currentRandom);
        }
    }

}
