
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int currentNumber = 0;
        int countOccurence = 0;
        
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            // get all the number from the file
            while(fileScanner.hasNext()){
                // find number between lower bound and upper bound
                currentNumber = Integer.valueOf(fileScanner.nextLine());
                if (currentNumber >= lowerBound && currentNumber <= upperBound){
                    countOccurence += 1;
                }
            }
            System.out.println("Numbers: " +countOccurence);
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
