
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scan.nextLine());
        String answer = "Greater number is: ";
        if (first > second){
            answer += first;
        } else if (second > first) {
            answer += second;
        } else {
            answer = "The numbers are equal!";
        }
        System.out.println(answer);
    }
}
