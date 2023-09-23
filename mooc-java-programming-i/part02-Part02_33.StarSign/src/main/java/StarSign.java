
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for(int countStars = 0; countStars < number; countStars++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        int rows = size;
        int columns = size;
        for (int countRows = 0; countRows < rows; countRows++){
            printStars(columns);
        }
        
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for(int countHeight = 0; countHeight < height; countHeight++){
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for(int stars = 1; stars <= size; stars++){
            printStars(stars);
            
        }
    }
}
