
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        
        // find smallest number       
         int smallestNumber = list.get(0);
        
        int index = 1;
        while(index<list.size()){
            int currentNumber = list.get(index);
            if (smallestNumber > currentNumber){
                smallestNumber = currentNumber;
            }
            index += 1;
        }
        System.out.println("Smallest number: " + smallestNumber);
        
        // find all the smallest number
        for (int currentIndex = 0; currentIndex < list.size(); currentIndex++){
            if (list.get(currentIndex) == smallestNumber){
                System.out.println("Found at index: " + currentIndex);
            }
        }

        
    }
}
