
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        // initialize center, row, column 
        int col = size/2;
        int row = 0;
        
        // we generate the value until we fill a whole cell so the size is size^2
        for(int value = 1; value <= size * size; value++){
            
            // we place a value in a cell
            square.placeValue(row, col, value);
            
            // we then calculate the next cell
            row--; // up one
            col++; // to the right
            
            // we check the boundaries
            // check if the diagnol boundary is cross
            if (value%size == 0){
                // completed diagonal and we detect value for the next cell
                // if current value is divisible by size it means we reach our boundary.
                // we don't have to detect is there a value in the next cell anymore.
                // this is the nature of diagonal completion for magic square.
                row += 2;
                col -= 1;
                
            } else if (col == size){
                col = 0;
            } else if (row < 0){
                row = size - 1;
            }
            
        }
        return square;
    }
    
    /*
    public Magicsquare HashMapMagicsquare(int size){
         int num = 1;
        int row = 0;
        int col = size / 2;

        while (num <= size * size) {
            String key = row + "," + col;
            magicSquareMap.put(key, num);
            
            num++;
            row--;
            col++;

            if (col == size) {
                col = 0;
            } else if (row < 0) {
                row = size - 1;
            } else if (magicSquareMap.containsKey(key)) {
                col--;
                row += 2;
            }
        }
    }*/

}
