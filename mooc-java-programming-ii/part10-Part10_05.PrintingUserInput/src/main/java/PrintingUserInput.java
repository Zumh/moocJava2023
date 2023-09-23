
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        ArrayList<String> inputs = new ArrayList<>();
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            inputs.add(userInput);
      
        }
        
        inputs
        .stream()
        .forEach(s -> System.out.println(s));
                
    }
}
