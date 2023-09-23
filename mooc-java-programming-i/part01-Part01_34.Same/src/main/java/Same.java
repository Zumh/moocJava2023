
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string:");
        String first = scan.nextLine();
        System.out.println("Enter the second string:");
        String second = scan.nextLine();
        String message = "Different";
        if (second.equals(first)){
            message = "Same";
        }
        System.out.println(message);
    }
}
