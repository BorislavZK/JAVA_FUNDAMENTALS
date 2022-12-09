package Lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        char firs = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);
        char third = scan.nextLine().charAt(0);

        String all = "" + firs + second + third;

        System.out.println(all);
    }
}
