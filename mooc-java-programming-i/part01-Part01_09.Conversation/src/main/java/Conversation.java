
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String message = "";
        System.out.println("Greetings! How are you doing?");
        message = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        message = scanner.nextLine();
        System.out.println("Thanks for sharing!");

    }
}
