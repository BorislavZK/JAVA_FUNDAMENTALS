package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        switch (type) {
            case "int":
                int firstInt = Integer.parseInt(scan.nextLine());
                int secondInt = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(firstInt, secondInt));
                break;
            case "char":
                char firstChar = scan.nextLine().charAt(0);
                char secondChar = scan.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scan.nextLine();
                String secondString = scan.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else {
            return secondNum;
        }
    }

    public static char getMax(char firstChar, char secondChar) {
        if (firstChar > secondChar) {
            return firstChar;
        } else {
            return secondChar;
        }
    }

    public static String getMax(String firstString, String secondString) {
        String result = "";
        if (firstString.compareTo(secondString) > 0) {
            result = firstString;
        } else {
            result = secondString;
        }
        return result;

    }

}
