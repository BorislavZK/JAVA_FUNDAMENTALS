package Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());




        double sumLight = Math.ceil(studentsCount * 1.1) * lightPrice;
        double sumRobes = studentsCount * robePrice;
        double sumBelts = (studentsCount - studentsCount / 6) * beltPrice;


    }
}
