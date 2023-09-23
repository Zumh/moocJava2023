
public class Program {
    public static String arrayAsString(int[][] array){
        StringBuilder result = new StringBuilder();
        
        for(int row = 0; row < array.length; row++){
            
            for(int column = 0; column < array[row].length; column++){
                
                result.append(array[row][column]); 
            }
            result.append('\n');
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        // Test your method here
        
        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
        
        int[][] matrix2 = {
            {3, 2, 7, 6},
            {2, 4, 1, 0},
            {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix2));
        
        int[][] matrix3 = {
            {1},
            {2, 2},
            {3, 3, 3},
            {4, 4, 4, 4}
          };
        System.out.println(arrayAsString(matrix3));

    }

}
