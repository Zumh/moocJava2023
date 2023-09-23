
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(true){
            System.out.println("Name: ");
            name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            Item newItem = new Item(name);
            items.add(newItem);
        }
        
        for(Item eachItem: items){
            System.out.println(eachItem);
        }
    }
}
