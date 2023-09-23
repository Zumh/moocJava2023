
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        String[] splitWords = {};
        
        while(true){
            userInput = scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            
            splitWords = userInput.split(" ");
            System.out.println(splitWords[splitWords.length-1]);
        }
    }
}
