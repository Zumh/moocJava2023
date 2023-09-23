
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        String[] data = {};
        try(Scanner fileScanner = new Scanner(Paths.get(file))){
            while(fileScanner.hasNext()){
                data = fileScanner.nextLine().split(",");
                System.out.println(data[0]+", age: "+data[1]+" years");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
