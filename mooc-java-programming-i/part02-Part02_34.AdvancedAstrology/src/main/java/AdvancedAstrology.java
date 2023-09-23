
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        
        for(int stars = 0; stars < number; stars++){
            System.out.print("*");
        }
        System.out.println(""); 
        
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int stars = 0; stars < number; stars++){
            System.out.print(" ");
        }
        
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int spaceCounter = size-1;
        int starCounter = 1;
        while(starCounter <= size ){
            printSpaces(spaceCounter);
            printStars(starCounter);
      
            spaceCounter--;
            starCounter++;
        }
    }

    
    public static void christmasTree(int height) {
        // part 3 of the exercise
        // the top branch
        for(int topHeight = 0; topHeight < height; topHeight++){
            printSpaces(height - topHeight - 1);
            printStars(2 * topHeight + 1);
        }
        
        // the trunk height
        int trunkHeigth = 2;
        int trunkWidth = 3;
        
        for(int topHeight = 0; topHeight < trunkHeigth; topHeight++){
            printSpaces(height-(trunkWidth/2)-1);
            printStars(trunkWidth);

        }
        
        
        
    }
    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        
    }
}
