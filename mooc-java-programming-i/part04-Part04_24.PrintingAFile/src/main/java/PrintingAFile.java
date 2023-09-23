
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        // we create a scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){
            
            while (scanner.hasNextLine()){
                // we read one line at a time
                String eachLine = scanner.nextLine();
                System.out.println(eachLine);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
