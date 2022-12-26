package Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String[] firstArray = scan.nextLine().split(" ");
        String[] secondArray = scan.nextLine().split(" ");

        for (String second : secondArray) {
            for (String first : firstArray) {
                if (first.equals(second)) {
                    System.out.print(second + " ");
                }

            }

        }
    }
}
