
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How old are you? ");
        int age = Integer.valueOf(scan.nextLine());
        String message = "Impossible!";
        if (0 <= age && age <= 120) {
            message = "OK";
        }
        System.out.println(message);
    }
}
