
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        while (number > -1 ){
            number = Integer.valueOf(scanner.nextLine());
            if (number > 0){
                numbers.add(number);
            }
        }
        
        numbers.stream()
                .filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));

    }
}
