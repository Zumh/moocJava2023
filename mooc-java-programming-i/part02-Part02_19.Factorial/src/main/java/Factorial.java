
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int givenNumber = Integer.valueOf(scanner.nextLine());
      
        int totalFactorial = 1;
        for (int countNumber = 1; countNumber <= givenNumber; countNumber++){
            totalFactorial *= countNumber;
        }
        System.out.println("Factorial:  "+totalFactorial);
    }
}
