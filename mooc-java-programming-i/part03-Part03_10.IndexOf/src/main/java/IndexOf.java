
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        // implement here finding the indices of a number
        
        System.out.println("Search for? ");
        int searchNumber = Integer.valueOf(scanner.nextLine());
  
        
        for (int currentIndex = 0; currentIndex < list.size(); currentIndex++){
            if (list.get(currentIndex) == searchNumber){
                System.out.println(searchNumber +" is at index " + currentIndex);
            }
        }
        
       
    }
}
