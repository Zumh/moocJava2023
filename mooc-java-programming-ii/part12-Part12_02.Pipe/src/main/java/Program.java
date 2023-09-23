
import java.util.Scanner;

public class Program {
    /*
    dibi
    dab
    dab
    daa
    */
    public static void part1(){
        Pipe<String> pipe = new Pipe<>();
        pipe.putIntoPipe("dibi");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("dab");
        pipe.putIntoPipe("daa");
        while(pipe.isInPipe()) {
            System.out.println(pipe.takeFromPipe());
        }
    }
    
    public static void part2(){
        // 6
        // null
        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
          part1();
        part2();
    }
}
