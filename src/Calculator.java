import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> results = new ArrayList<Integer>();

    public Calculator() {
    }

    public int calculate(int numOne, String operator, int numTwo) {
        if (operator.equals("+")) {
            return numOne + numTwo;
        } else if (operator.equals("-")) {
            return numOne - numTwo;
        } else if (operator.equals("*")) {
            return numOne * numTwo;
        } else {
            if (numTwo == 0) {
                return Integer.MIN_VALUE;
            } else {
                return numOne / numTwo;
            }
        }
    }
    public void saveResults (int eachResult) {
        this.results.add(eachResult);
    }

    public ArrayList<Integer> getResults () {
        return this.results;
    }

    public void setResults (ArrayList<Integer> results) {
        this.results = results;
    }

    public void removeFirstResult () {
        this.results.remove(0);
    }
}