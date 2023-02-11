package MidExamPreparation;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int empOne = Integer.parseInt(scan.nextLine());
        int empTwo = Integer.parseInt(scan.nextLine());
        int empTree = Integer.parseInt(scan.nextLine());

        int students = Integer.parseInt(scan.nextLine());

        int totalCapacityPerHour = empOne + empTwo + empTree;
        int hoursNeeded = 0;

        for (int i = 1; 0 < students; i++) {
            if (i % 4 != 0) {
                students -= totalCapacityPerHour;
                hoursNeeded++;
            } else {
                hoursNeeded++;
            }

        }

        System.out.printf("Time needed: %dh.", hoursNeeded);
    }


}
