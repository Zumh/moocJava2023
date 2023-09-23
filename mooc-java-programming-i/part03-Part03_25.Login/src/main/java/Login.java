
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userName = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};
        System.out.println("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter password: ");
        String inputPassword = scanner.nextLine();
        boolean found = false;
        
        for(int index = 0; index < userName.length; index++){
            
            if (userName[index].equals(inputUsername) && password[index].equals(inputPassword)){
                found = true;
                break;
            } 
        }
        
        if (found){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
