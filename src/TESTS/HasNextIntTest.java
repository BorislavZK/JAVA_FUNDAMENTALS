package TESTS;

import java.util.Scanner;

public class HasNextIntTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int total = 0;

        while (scan.hasNextInt()){

            total += scan.nextInt();

        }

        System.out.println(total);


    }
}
