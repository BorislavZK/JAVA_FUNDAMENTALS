package Lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);

        String all = "" + third + " " + second + " " + first;

        System.out.println(all);
    }
}
