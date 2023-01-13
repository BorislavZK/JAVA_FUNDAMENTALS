package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        int firstNum = Integer.parseInt(scan.nextLine());
        String operatorInput = scan.nextLine();
        int secondNum = Integer.parseInt(scan.nextLine());


        System.out.println(df.format(calculation(firstNum, operatorInput, secondNum)));


    }

    private static double calculation (int first, String operator, int second){
        //  / * + -
        double result = 0;

        switch (operator){
            case "/":
                result = 1.00 * first / second;
                break;
            case "*":
                result = first*second;
                break;
            case "+":
                result = first+second;
                break;
            case "-":
                result = first-second;
                break;
        }

        return result;
    }
}
