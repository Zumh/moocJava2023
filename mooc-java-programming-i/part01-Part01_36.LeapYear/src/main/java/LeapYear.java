
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int year = Integer.valueOf(scan.nextLine());
        String message = "The year is not a leap year.";
        if (year % 4 == 0){
            if (year % 100 != 0){
                message = "The year is a leap year.";
            } else if (year % 400 == 0) {
                message = "The year is a leap year.";
            } 
        }
        System.out.println(message);
    }
}