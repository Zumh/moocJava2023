
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int sumOfNumbers = 0;
        int countNumber = 0;
        
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("0")){
                break;
            }
         
            
            if(Integer.valueOf(userInput) > 0){
                sumOfNumbers += Integer.valueOf(userInput);
                countNumber++;
            }
            
        }
        if (countNumber > 0){
            System.out.println((sumOfNumbers*1.0)/countNumber);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
