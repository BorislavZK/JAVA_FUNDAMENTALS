package MidExamPreparation;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int additionalBonus = Integer.parseInt(scan.nextLine());
        double maxTotalBonus = Double.MIN_VALUE;
        int maxStudentAttendance = 0;

        for (int i = 1; i <= students ; i++) {
            double currentTotalBonus = 0;
            int attendance = Integer.parseInt(scan.nextLine());

           //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})


            currentTotalBonus = Math.round(1.00 * attendance / lectures * ( 5 + additionalBonus));

            if(currentTotalBonus > maxTotalBonus){
                maxTotalBonus = currentTotalBonus;
                maxStudentAttendance = attendance;
            }

        }

        System.out.printf("Max Bonus: %.0f.%n", maxTotalBonus);
        System.out.printf("The student has attended %d lectures.", maxStudentAttendance);


    }
}
