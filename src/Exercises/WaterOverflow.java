package Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tankCapacity = 255;
        int totalWater = 0;

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= n; i++) {

            int water = Integer.parseInt(scan.nextLine());

            if (tankCapacity >= water) {
                tankCapacity -= water;
                totalWater += water;
            } else {
                System.out.println("Insufficient capacity!");

            }

        }
        System.out.println(totalWater);
    }
}
