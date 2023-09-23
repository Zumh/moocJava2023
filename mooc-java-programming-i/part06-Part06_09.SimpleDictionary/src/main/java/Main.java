
import java.util.Scanner;

public class Main {
    public static void part1Dictionary(){
        SimpleDictionary book = new SimpleDictionary();
        book.add("one", "yksi");
        book.add("two", "kaksi");

        System.out.println(book.translate("one"));
        System.out.println(book.translate("two"));
        System.out.println(book.translate("three"));
    }
    public static void part1Start(){
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
    }
    
    public static void part2(){
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textUI = new TextUI(scanner, dictionary);
        
        textUI.start();
        System.out.println(dictionary.translate("pike"));
    }
    
    public static void part3(){
        // we add search
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        
        TextUI textUI = new TextUI(scanner, dictionary);
        
        textUI.start();
        
        
    }
    
    
    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        //part1Dictionary();
        //part1Start();
        //part2();
        part3();
    }
}
