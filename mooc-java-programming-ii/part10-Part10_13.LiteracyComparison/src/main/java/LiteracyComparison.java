
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        // theme, age group, gender, country, year, literacy percent
        String file = "literacy.csv";
        ArrayList<Literacy> literacyCollection = new ArrayList<>();
        int count = 0;
        // read the file 
        try{//  Literacy(String gender, String country, int year, double literacyPercent)
            Files.lines(Paths.get(file))
                .map(line -> line.split(","))
                .map(parts -> new Literacy(parts[2].split(" ")[1].trim(), parts[3].trim(), Integer.valueOf(parts[4].trim()), Double.valueOf(parts[5].trim())))
                .forEach(literacyData -> literacyCollection.add(literacyData));
            
            // sort the object here 
            literacyCollection.stream()
                    .sorted()
                    .forEach(lit -> System.out.println(lit));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
       
    }
}
