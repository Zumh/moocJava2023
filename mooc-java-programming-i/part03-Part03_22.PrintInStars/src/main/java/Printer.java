
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        String stars = "";
        for (int number : array){
            for(int eachStar = 0; eachStar < number; eachStar++){
                stars += "*";
            }
            stars += "\n";
        }
        
        System.out.println(stars);
        
    }

}
