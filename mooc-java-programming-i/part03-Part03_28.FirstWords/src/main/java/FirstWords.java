
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        
        while(true){
            userInput = scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            
            System.out.println(userInput.split(" ")[0]);
        }
    }
}
