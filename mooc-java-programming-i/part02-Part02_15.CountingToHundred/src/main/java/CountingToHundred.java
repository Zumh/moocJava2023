
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenNumber = Integer.valueOf(scanner.nextLine());
        int maxNumber = 100;
        
        while(givenNumber <= maxNumber){
            System.out.println(givenNumber);
            givenNumber++;
        }
    }
}
