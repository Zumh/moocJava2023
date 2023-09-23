package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
      
        System.out.print("Enter title: ");
        Scanner scanner = new Scanner(System.in);
        
        Application.launch(UserTitle.class, "--title="+scanner.nextLine());
    }

}
