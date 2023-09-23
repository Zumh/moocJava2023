
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        // get input and add them in a list
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            }
            
            list.add(number);
            
        }
        
        int countNumber = list.size();
        int totalSum = 0;
        
        for(int eachNumber: list){
            totalSum += eachNumber;
        }
        
        // calculate the average and print
        System.out.println("Average: " + ((totalSum*1.0)/countNumber));
    }
}
