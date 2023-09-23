
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String password = scan.nextLine();
        String message = "Off with you!";
        if (password.equals("Caput Draconis")){
            message = "Welcome!";
        }
        System.out.println(message);
    }
}
