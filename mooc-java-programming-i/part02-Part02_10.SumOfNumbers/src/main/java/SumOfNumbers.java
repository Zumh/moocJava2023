
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        int number = -1;
        while (number != 0){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number != 0){
                totalSum += number;
            }
        }
        System.out.println("Sum of the numbers: " + totalSum);
    }
}
