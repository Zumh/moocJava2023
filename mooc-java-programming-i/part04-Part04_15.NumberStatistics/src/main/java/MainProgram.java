
import java.util.Scanner;

public class MainProgram {
    public static void part1(Statistics statistics){
        
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        
    }
    
    public static void part2(Statistics statistics){
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: "+ statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
    
    public static void part3(Statistics statistics){
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter numbers:");
        while(true){
           
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }
            statistics.addNumber(userInput);
            
            
        }
        
        System.out.println("Sum: "+statistics.sum());
    }
    
    public static void part4(){
        Scanner scanner = new Scanner(System.in);
        Statistics statisticsAll = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        
       
        int userInput = 0;
        
        System.out.println("Enter numbers:");
        while(true){
            userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == -1){
                break;
            }
            statisticsAll.addNumber(userInput);
            
            if (userInput% 2 == 0){
                statisticsEven.addNumber(userInput);
            } else {
                statisticsOdd.addNumber(userInput);
            }
        }
        System.out.println("Sum: " + statisticsAll.sum());
        System.out.println("Sum of even numbers: "+statisticsEven.sum());
        System.out.println("Sum of odd numbers: "+statisticsOdd.sum());
    }
    
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        
        
        part1(statistics);
        part2(statistics);
        part3(statistics);
        part4();
        
        
    }
}
