package Lab;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        String[] day = new String[]
                {"Monday",
                        "Tuesday",
                        "Wednesday",
                        "Thursday",
                        "Friday",
                        "Saturday",
                        "Sunday"};

        if (number >= 1 && number <= 7) {
            System.out.println(day[number - 1]);
        } else {
            System.out.println("Invalid day!");
        }


    }
}
