
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100:");
        int grade = Integer.valueOf(scan.nextLine());
        String result = "Grade: ";
        
        if (grade < 0){
            result = "impossible!";
        } else if (grade > 100){
            result = "incredible!";
        } else if (0 <= grade && grade <= 49){
            result = "failed";
        } else if (50 <= grade && grade <= 59){
            result += 1;
        } else if (60 <= grade && grade <= 69){
            result += 2;
        } else if (70 <= grade && grade <= 79){
            result += 3;
        } else if (80 <= grade && grade <= 89){
            result += 4;
        } else if (90 <= grade && grade <= 100){
            result += 5;
        }
        
        System.out.println(result);
    }
}
