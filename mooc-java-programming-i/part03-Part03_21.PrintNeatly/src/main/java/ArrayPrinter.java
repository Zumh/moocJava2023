
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String result = "";
        for(int index = 0; index < array.length; index++){
            if (index < array.length-1){
                result += array[index] + ", ";
            }else{
                result += array[index];
            }
        }
        System.out.println(result);
    }
}
