
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEnter = 0;
        String inputText = "";
        while(true){
            inputText = scanner.nextLine();
            if(inputText.equals("end")){
                break;
            }
            countEnter += 1;
        }
        
        System.out.println(countEnter);
    }
}
