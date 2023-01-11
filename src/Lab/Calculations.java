package Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String action = scan.nextLine();

        int inputOne = Integer.parseInt(scan.nextLine());
        int inputTwo = Integer.parseInt(scan.nextLine());

        switch (action) {
            case "add":
                addNumbers(inputOne, inputTwo);
                break;
            case "multiply":
                multiplyNumbers(inputOne, inputTwo);
                break;
            case "subtract":
                subtractNumbers(inputOne, inputTwo);
                break;
            case "divide":
                divideNumbers(inputOne, inputTwo);
                break;
        }
    }

    public static void addNumbers(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public static void multiplyNumbers(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    public static void subtractNumbers(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    public static void divideNumbers(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }
}
