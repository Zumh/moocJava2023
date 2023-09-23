
import java.util.Scanner;

public class Program {
    public static void part1(){
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));
    }
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sumTotal = 0;
        int number = 0;
        if (fromWhere < 0){
            fromWhere = 0;
        }
        
        if(toWhere > array.length){
            toWhere = array.length;
        }
        
        for(int index = fromWhere; index < toWhere; index++){
            number = array[index];
            if (number >= smallest && number <= largest){
                sumTotal += number;
            }
        }
        return sumTotal;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        part1();

    }

}
