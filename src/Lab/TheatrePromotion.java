package Lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        int price = 0;
        boolean flag = true;


        if (0 <= age && age <= 18) {   //0 <= age <= 18
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else if (day.equals("Holiday")) {
                price = 5;
            }

        } else if (18 < age && age <= 64) {  //18 < age <= 64
            if (day.equals("Weekday")) {
                price = 18;
            } else if (day.equals("Weekend")) {
                price = 20;
            } else if (day.equals("Holiday")) {
                price = 12;
            }
        } else if (46 < age && age <= 122) {  //64 < age <= 122
            if (day.equals("Weekday")) {
                price = 12;
            } else if (day.equals("Weekend")) {
                price = 15;
            } else if (day.equals("Holiday")) {
                price = 10;
            }

        } else {
            System.out.println("Error!");
            flag = false;
        }

        if (flag){
            System.out.printf("%d$", price);
        }
    }
}
