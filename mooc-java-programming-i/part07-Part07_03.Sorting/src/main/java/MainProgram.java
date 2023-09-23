
import java.util.Arrays;


public class MainProgram {
    
    public static int smallest(int[] array){
        int smallestValue = array[0];
        for(int number: array){
            if(smallestValue > number){
                smallestValue = number;
            }
        }
        return smallestValue;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallestValue = smallest(array);
        
      
        int smallestIndex = 0;
        for(int number: array){
           
            if(smallestValue == number){
                
                break;
            }
            smallestIndex++;

        }
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        
        // allocate a chunk of memory to slice array
        int smallestValue = table[startIndex];
        int smallestIndex = startIndex;
        
        for(int index = startIndex; index < table.length; index++){
            if (smallestValue > table[index]){
                smallestValue = table[index];
                smallestIndex = index;
        
            }
        }
        
        return smallestIndex;
        
     
    }
    
    public static void swap(int[] array, int index1, int index2){
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }
    
    public static void sort(int[] array){
        /*
        1. Start from the first element (index 0) of the array.
        2. Find the smallest element in the remaining unsorted part of the array, starting from the current index.
        3. Swap the smallest element with the element at the current index.
        4. Move to the next element (increment the current index) and repeat steps 2 and 3.
        5. Continue this process until you've processed all elements in the array.
        */
        int smallestValueIndex = 0;
        
        for(int index = 0; index<array.length; index++){
            // find smallest element in the remaining unsorted part of array
            smallestValueIndex = indexOfSmallestFrom(array, index);
            swap(array, index, smallestValueIndex);
            
        }
        
    }
    
    public static void part1(){
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
    }
    
    public static void part2(){
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
    }
    
    public static void part3(){
        // indices:       0  1  2  3   4
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
    }
    
    public static void part4(){
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static void part5(){
        //int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        int[] numbers = {6, 3, 0, -1, 4};
        System.out.println(indexOfSmallest(numbers));
        System.out.println(Arrays.toString(numbers));
        MainProgram.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    
    public static void main(String[] args) {
        // write your test code here
        part1();
        part2();
        part3();
        part4();
        part5();
        
    }

}
