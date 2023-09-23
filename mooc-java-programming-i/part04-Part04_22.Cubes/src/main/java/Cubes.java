
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cube = 0;
        String inputText = "";
        while(true){
            inputText = scanner.nextLine();
            if(inputText.equals("end")){
                break;
            }
            cube = Integer.valueOf(inputText);
            
            System.out.println(cube*cube*cube);
        }
        
       

    }
}
