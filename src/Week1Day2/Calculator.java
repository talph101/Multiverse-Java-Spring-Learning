package Week1Day2;

public class Calculator {
    //This program calculates numbers
    int firstNum;
    int secondNum;

    public Calculator () {
    }

    public int add(int a, int b) {
        int added = a + b;
        return added;
    }

    public int subtract(int c, int d) {
        int sub = c - d;
        return sub;
    }

    public void multNums(){
        int mult = firstNum * secondNum;
        System.out.println(mult);
    }


    public static void main(String [] args) {
        Calculator firstCalculator = new Calculator();
        Calculator secondCalculator = new Calculator();


        System.out.println(firstCalculator.add(2,3));
        System.out.println(secondCalculator.subtract(8,4));
        secondCalculator.multNums();

    }
}

