package Week1Day2;

public class Calculator {
    int firstNum;
    int secondNum;

    public Calculator (int numOne, int numTwo) {
        firstNum = numOne;
        secondNum = numTwo;
    }

    public int addNums() {
        int added = firstNum + secondNum;
        return added;
    }

    public int subNums() {
        int sub = firstNum - secondNum;
        return sub;
    }

    public void multNums(){
        int mult = firstNum * secondNum;
        System.out.println(mult);
    }


    public static void main(String [] args) {
        Calculator firstCalculator = new Calculator(2,3);
        Calculator secondCalculator = new Calculator(10,3);


        System.out.println(firstCalculator.addNums());
        System.out.println(secondCalculator.subNums());
        secondCalculator.multNums();

    }
}

