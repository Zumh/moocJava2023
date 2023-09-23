
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.valueOf(scanner.nextLine());
        int count = 0;
        while (count <= maxNumber){
            System.out.println(count);
            count += 1;
        }
    }
}
