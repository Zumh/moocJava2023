
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {
    public static List<Integer> positive(List<Integer> numbers){
        //ArrayList<Integer> 
                List<Integer> positiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
                //.collect(Collectors.toCollection(ArrayList::new));

                
        return positiveNumbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        
    }

}
