
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        int inputNumber = 0;
        
        System.out.println("Give a number:");
        // ask user to give the number
        inputNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("You gave the number " + inputNumber);
    }
}
