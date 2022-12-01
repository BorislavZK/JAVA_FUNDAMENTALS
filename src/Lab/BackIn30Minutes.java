package Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int initHour = Integer.parseInt(scan.nextLine());
        int initMin = Integer.parseInt(scan.nextLine());

        int allMinutes = (initHour * 60 ) + initMin + 30;

        int hour = allMinutes / 60;
        int min = allMinutes % 60;

        if (hour > 23){
            hour = 0;
        }

        String result = String.format("%d:%02d",hour, min); // ZA TEST

        System.out.println(result);
    }
}
