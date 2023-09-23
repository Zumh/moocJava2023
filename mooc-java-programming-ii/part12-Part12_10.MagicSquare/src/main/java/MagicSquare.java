
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        
        ArrayList<Integer> rowSum = new ArrayList<>();
        int currentSum = 0;
        for(int row = 0; row < this.square.length; row++){
            for(int column = 0; column < this.square[row].length; column++){
                // calculate the row sum
                currentSum += this.square[row][column];
            }
            
            rowSum.add(currentSum);
            currentSum = 0;
        }
        return rowSum;
    }

    public ArrayList<Integer> sumsOfColumns() {
        
        ArrayList<Integer> columnSum = new ArrayList<>();
        int currentSum = 0;
        for(int column = 0; column < this.square.length; column++){
            for(int row = 0; row < this.square[column].length; row++){
                // calculate the row sum
                currentSum += this.square[row][column];
            }
            
            columnSum.add(currentSum);
            currentSum = 0;
        }
        return columnSum;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sumOfTotal = new ArrayList<>();
        int topToBottomSum = 0, bottomToTopSum = 0;
        int column = 0, bottomToTop = this.square.length - 1;
        for(int row = 0; row < this.square.length; row++){
            column = row;
            topToBottomSum += this.square[row][column];
            bottomToTopSum += this.square[row][bottomToTop];
            bottomToTop -= 1;
            
        }
        sumOfTotal.add(topToBottomSum);
        sumOfTotal.add(bottomToTopSum);
        
        return sumOfTotal;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
