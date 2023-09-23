
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class AverageOfNumbers {

    public static void main(String[] args) {
        /*
        
        To-Do List:

        Create a program to read user input.
        If input is "end", stop reading.
        Collect input as numbers.
        When "end" is entered, calculate average using a stream.
        Print the average.
        */
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        // Write your program here
        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("end")){
                break;
            }
            numbers.add(userInput);
            
        }
        double average = numbers.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .average()
                .getAsDouble();
        // calculate average with stream
        System.out.println("average of the numbers: " + average);
    }
}
