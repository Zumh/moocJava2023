
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int totalSum = 0;
        System.out.println("Give the first number:");
        totalSum += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        totalSum += Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        totalSum += Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + (totalSum/3.0));
    }
}
