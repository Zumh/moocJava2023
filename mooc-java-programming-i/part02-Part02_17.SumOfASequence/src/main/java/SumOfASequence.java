
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        int sumOfTotal = 0;
        for (int countNumber = 1; countNumber <= lastNumber; countNumber++){
            sumOfTotal += countNumber;
        }
        System.out.println("The sum is "+sumOfTotal);
    }
}
