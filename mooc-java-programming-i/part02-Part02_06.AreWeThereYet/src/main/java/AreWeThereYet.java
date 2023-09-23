
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while(true){
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            if (number == 4){
                break;
            }
        }
    }
}
