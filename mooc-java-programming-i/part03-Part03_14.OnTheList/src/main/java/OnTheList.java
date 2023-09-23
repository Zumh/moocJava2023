
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for? ");
        String searchName = scanner.nextLine();
        if (list.contains(searchName)){
            searchName = searchName + " was found!";
        } else {
            searchName = searchName + " was not found!";
        }
        System.out.println(searchName);
    }
}
