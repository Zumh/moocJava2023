
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cube = 0;
        String userInput = "";
        
        while(true){
            userInput = scanner.nextLine();
            if(userInput.equals("end")){
                break;
            }
            
            cube = Integer.valueOf(userInput);
            
            cube = cube * cube * cube;
       
            System.out.println(cube);
        }
    }
}
