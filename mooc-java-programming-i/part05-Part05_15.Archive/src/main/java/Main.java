
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemsCollected = new ArrayList<>();
        
        String id = "";
        String name = "";
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            id = scanner.nextLine();
            if(id.equals("")){
                break;
            }       
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            
            if(name.equals("")){
                break;
            }
            
            Items newItem = new Items(id, name);
            
            if(!itemsCollected.contains(newItem)){
                itemsCollected.add(newItem);
            }
            
        }
        
        System.out.println("==Items==");
        for(Items item:itemsCollected){
            System.out.println(item);
        }

    }
}
