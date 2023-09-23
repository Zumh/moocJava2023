package validating;

public class Calculator {

    public int factorial(int num) {
        if(num < 0){
            throw new IllegalArgumentException("Illegal factorial number");
        }
        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize < subsetSize){
            throw new IllegalArgumentException ("Illegal size");
        }
        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
