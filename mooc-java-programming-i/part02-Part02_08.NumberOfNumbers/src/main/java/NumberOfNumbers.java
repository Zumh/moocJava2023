
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumberInputValues = 0;
        int number = -1;
        while (number != 0){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number != 0){
                totalNumberInputValues += 1;
            }
        }
        System.out.println("Number of numbers: " + totalNumberInputValues);
    }
}
