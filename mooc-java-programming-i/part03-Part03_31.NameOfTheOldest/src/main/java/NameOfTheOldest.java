
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        int oldestAge = 0;
        int currentAge = 0;
        String[] nameAndAge = {};
        String oldestName = "";
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            
            nameAndAge = userInput.split(",");
            currentAge = Integer.valueOf(nameAndAge[1]); 
            if(oldestAge < currentAge){
                oldestAge = currentAge;
                oldestName = nameAndAge[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
