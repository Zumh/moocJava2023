
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
       
    public static void sort(String[] array){
        Arrays.sort(array);
    }
    
       
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    
    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] tempArray = {3, 1, 5, 99, 3, 12};
        for(int number:tempArray){
            numbers.add(number);
        }
        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);
        
        
    }

}
