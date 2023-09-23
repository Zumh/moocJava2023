
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Second number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        int sumOfTotal = 0;
        for (int countNumber = firstNumber; countNumber <= lastNumber; countNumber++){
            sumOfTotal += countNumber;
        }
        System.out.println("The sum is "+sumOfTotal);

    }
}
