package Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //DecimalFormat df = new DecimalFormat("#.00");

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        double firstNumFactorial = factorialCalculation(firstNum);
        double secondNumFactorial = factorialCalculation(secondNum);

        double result = firstNumFactorial / secondNumFactorial;

        //System.out.println(df.format(result));

        System.out.printf("%.2f", result);

    }

    private static double factorialCalculation(int num) {
        double factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
