import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        ArrayList<Literature> literature = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            String title = userInput;
            System.out.print("Input the age recommendation: ");
            userInput = scanner.nextLine();
            int ageLimit = Integer.valueOf(userInput);
            
            literature.add(new Literature(title, ageLimit));
            
            
           
        }
        // compare and sort them here
        Comparator<Literature> comparator = Comparator
                .comparing(Literature::getAge)
                .thenComparing(Literature::getTitle);
        
        Collections.sort(literature, comparator);
        
        System.out.println(literature.size() + " books in total.");
        System.out.println("Books:");
        for(Literature book : literature){
            System.out.println(book);
        }
    }

}
