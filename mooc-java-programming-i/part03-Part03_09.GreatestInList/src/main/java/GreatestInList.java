
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        int maxNumber = list.get(0);
        
        int index = 1;
        while(index<list.size()){
            int currentNumber = list.get(index);
            if (maxNumber < currentNumber){
                maxNumber = currentNumber;
            }
            index += 1;
        }
        System.out.println("The greatest number: " + maxNumber);
    }
}
