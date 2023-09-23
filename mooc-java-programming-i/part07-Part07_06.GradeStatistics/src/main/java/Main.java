
import java.util.Scanner;

public class Main {
    public static void part1(){
        String numberAsString = "3";
        int number = Integer.valueOf(numberAsString);

        System.out.println(numberAsString + 7);
        System.out.println(number + 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
        
    }
}
