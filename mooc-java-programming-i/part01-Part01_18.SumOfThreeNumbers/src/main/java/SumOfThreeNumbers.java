
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int number= 0;
        System.out.println("Give the first number:");
        number += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        number += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        number += Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + number);
    }
}
