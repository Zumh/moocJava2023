package mooc;
import mooc.logic.ApplicationLogic;
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;



public class Main {
    public static void part1(){
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
    public static void main(String[] args) {
        System.out.println("Hello packages!");
        part1();
    }
}
