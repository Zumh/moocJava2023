
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        while(true){
            userInput = scanner.nextLine();
            if (userInput.equals("")){
                break;
            }
            
            for(String word: userInput.split(" ")){
                if (word.contains("av")){
                    System.out.println(word);
                   
                }
            }
        }
    }
}
