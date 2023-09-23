
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        // toteuta ohjelmasi tänne
        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("end")){
                break;
            }
            numbers.add(userInput);
            
        }
        System.out.println("Print the average of the negative numbers or the positive numbers?\n(n\\p)");
        userInput = scanner.nextLine();
        double average = 0.0;
        if(userInput.equals("n")){
            average = numbers.stream()
                    .mapToInt(number -> Integer.valueOf(number))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
        } else if(userInput.equals("p")){
            average = numbers.stream()
                    .mapToInt(number -> Integer.valueOf(number))
                    .filter(number -> number >= 0)
                    .average()
                    .getAsDouble();
        }
        System.out.println("Average of the negative numbers: " + average);
        
    }
}
