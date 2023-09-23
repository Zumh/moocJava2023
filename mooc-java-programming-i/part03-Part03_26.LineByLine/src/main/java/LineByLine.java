
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] splitter = {};
        String userInput = "not empty";
        while (true){
            userInput = scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            splitter = userInput.split(" ");
            for(String word : splitter){
                System.out.println(word);
            }
        }
        
        
    }
}
