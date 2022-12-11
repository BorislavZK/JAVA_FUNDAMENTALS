package Exercises;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int forth = Integer.parseInt(scan.nextLine());


        int total = ((first+second)/third) * forth;

        System.out.println(total);
    }
}
