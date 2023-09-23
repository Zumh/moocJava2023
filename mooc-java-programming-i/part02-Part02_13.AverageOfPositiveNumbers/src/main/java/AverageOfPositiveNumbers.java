
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalSum = 0.00;
        int amountOfNumberInput = 0;
        int number = -1;
        while (number != 0){
            number = Integer.valueOf(scanner.nextLine());
            if (number > 0){
                totalSum += number;
                amountOfNumberInput += 1;
            } 
        }
        if (totalSum > 0){
            System.out.println(totalSum/amountOfNumberInput);
        } else {
            System.out.println("Cannot calculate the average");
        }
        
    }
}
