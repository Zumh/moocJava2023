
import java.util.Scanner;
import java.util.ArrayList;

public class Program {
    public static void part4(){
        List<String> myList = new List<>();
        myList.addValues("hello");
        myList.addValues("world");

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }
    }
    public static void part3(){
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.addValues("hello");
        System.out.println(myList.contains("hello"));
        myList.remove("hello");
        System.out.println(myList.contains("hello"));
    }
    public static void part2(){
        List<String> myList = new List<>();
        System.out.println(myList.contains("hello"));
        myList.addValues("hello");
        System.out.println(myList.contains("hello"));
    }
    public static void part1(){
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.contains("Hello!"));
        strings.add("Hello!");
        System.out.println(strings.contains("Hello!"));
        strings.remove("Hello!");
        System.out.println(strings.contains("Hello!"));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your class here
        part1();
        part2();
        part3();
        part4();
    }

}
