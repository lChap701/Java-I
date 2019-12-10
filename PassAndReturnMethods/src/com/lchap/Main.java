package com.lchap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double sum, n1 = 3.5, n2 = 2.6;
        int int1 = 5, int2 = 7;

        sum = calcSumOfTwoNumbers(int1,int2);

        printSum(sum);
    }

    /**
     * Calculate and return the sum of two values
     * @param num1
     * @param num2
     * @return
     */

    public static double calcSumOfTwoNumbers(double num1, double num2) {
        return num1 + num2;

    }

    public static void printSum(double s){ System.out.println("The sum is " + s);
    }

}
