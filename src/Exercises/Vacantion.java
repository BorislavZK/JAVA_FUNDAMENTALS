package Exercises;

import java.util.Scanner;

public class Vacantion {
    public static void main(String[] args) {

        //30
        //Students
        //Sunday

        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        String type = scan.nextLine();
        String day = scan.nextLine();

        double pricePerDay = 0;
        double totalPrice = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    pricePerDay = 8.45;
                } else if (day.equals("Saturday")) {
                    pricePerDay = 9.80;
                } else {
                    pricePerDay = 10.46;    // MOJE DA IMA PROBLEM
                }
                break;

            case "Business":
                if (day.equals("Friday")) {
                    pricePerDay = 10.90;
                } else if (day.equals("Saturday")) {
                    pricePerDay = 15.60;
                } else {
                    pricePerDay = 16;    // MOJE DA IMA PROBLEM
                }
                break;

            case "Regular":
                if (day.equals("Friday")) {
                    pricePerDay = 15;
                } else if (day.equals("Saturday")) {
                    pricePerDay = 20;
                } else {
                    pricePerDay = 22.50;    // MOJE DA IMA PROBLEM
                }
                break;

        }

        totalPrice = pricePerDay * count;

        if (type.equals("Students") && count >= 30) {
            totalPrice = totalPrice * 0.85;

        } else if (type.equals("Business") && count >= 100) {
            totalPrice = pricePerDay * (count - 10);
        } else if (type.equals("Regular") && count >= 10 && count <= 20){
            totalPrice = totalPrice * 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
