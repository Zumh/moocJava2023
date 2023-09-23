
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0.00;
        int amountOfNumberInput = 0;
        int number = -1;
        while (number != 0){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number != 0){
                totalSum += number;
                amountOfNumberInput += 1;
            }
        }
        System.out.println("Average of the numbers: " + (totalSum/amountOfNumberInput));
        
    }
}
