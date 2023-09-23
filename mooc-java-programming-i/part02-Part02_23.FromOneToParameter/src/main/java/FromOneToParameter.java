
import java.util.Scanner;



public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        printUntilNumber(number);
    }
    
    public static void printUntilNumber(int number){
        for(int numberCounter = 1; numberCounter <= number; numberCounter++){
            System.out.println(numberCounter);
        }
    }

}
