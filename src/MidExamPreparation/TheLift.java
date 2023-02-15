package MidExamPreparation;

import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scan.nextLine());

        String[] input = scan.nextLine().split("\\s+");

        int[] liftLine = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            liftLine[i] = Integer.parseInt(input[i]);
        }


        for (int i = 0; i < liftLine.length; i++) {
            int currentFreeSpace = 0;

            if(liftLine[i] < 4){
                currentFreeSpace = 4 - liftLine[i];
                peopleWaiting -= currentFreeSpace;
                    if(peopleWaiting < 0){
                        int difference = Math.abs(peopleWaiting);
                        peopleWaiting = 0;
                        liftLine[i] = 4 - difference;
                    }

            }

        }




    }
}
