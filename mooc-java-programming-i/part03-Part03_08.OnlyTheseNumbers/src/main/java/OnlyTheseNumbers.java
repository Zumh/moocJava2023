
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        
        System.out.println("From where? ");
        int from = Integer.valueOf(scanner.nextLine());
        System.out.println("to where? ");
        int to = Integer.valueOf(scanner.nextLine());
        
        for (int index = from; index <= to; index++){
            System.out.println(numbers.get(index));
        }

    }
}
