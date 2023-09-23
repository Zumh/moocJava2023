
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
    
        String[] nameAndBirthYear = {};
        String longestName = "";
        int totalBirthYear = 0;
        int amountOfPersonalDetails = 0;
        
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            
            nameAndBirthYear = userInput.split(",");

            totalBirthYear += Integer.valueOf(nameAndBirthYear[1]); 
            
            if(longestName.length() < nameAndBirthYear[0].length()){
                longestName = nameAndBirthYear[0];
                
            }
            amountOfPersonalDetails++;
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((totalBirthYear * 1.0)/amountOfPersonalDetails));

    }
}
