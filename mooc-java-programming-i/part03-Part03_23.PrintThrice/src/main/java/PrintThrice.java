
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        for(int number = 0; number < 3; number++){
            System.out.print(word);
        }
    }
}
