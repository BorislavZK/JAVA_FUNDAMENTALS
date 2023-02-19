package MidExam;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double neededExp = Double.parseDouble(scan.nextLine());
        int countOfBattles = Integer.parseInt(scan.nextLine());
        double totalExp = 0;
        int battlecount = 0;

        boolean ifExpOK = false;

        for (int i = 1; i <= countOfBattles; i++) {
            double experiencePerBattle = Double.parseDouble(scan.nextLine());

            if (i % 3 == 0) {
                experiencePerBattle *= 1.15; //OK
                totalExp += experiencePerBattle;
            } else if (i % 5 == 0) {
                experiencePerBattle *= 0.90;
                totalExp += experiencePerBattle;
            } else if (i % 15 == 0) {
                experiencePerBattle *= 1.05;
                totalExp += experiencePerBattle;
            } else {
                totalExp += experiencePerBattle;
            }

            battlecount ++;

            if ( totalExp >= neededExp){
                System.out.printf("Player successfully collected his needed experience for %d battles.", battlecount);
                ifExpOK = true;
                break;
            }
        }

        if (!ifExpOK){
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExp - totalExp);
        }
    }
}
