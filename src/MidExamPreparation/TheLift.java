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
            int difference = 0;

            if (liftLine[i] < 4) { // проверка дали има свободни места
                currentFreeSpace = 4 - liftLine[i]; // ако има взимаме броя свободни места
                liftLine[i] += currentFreeSpace; //качваме хората в лифта
                peopleWaiting -= currentFreeSpace; // чакащите хора минус свободните места

                if (peopleWaiting < 0) { // ако чакащите хора станат отрицателно число
                    difference = Math.abs(peopleWaiting); // разликата от нулата
                    peopleWaiting = 0; // нулираме чакащите
                    liftLine[i] -= difference; // вадим разликата от вече качените хора
                }

            }

        }
        boolean isFreeSpace = false;
        for (int i = 0; i < liftLine.length; i++) {
            if (liftLine[i] != 4) {
                isFreeSpace = true;
            }
        }
        if (isFreeSpace) {
            System.out.println("The lift has empty spots!");
        } else {
            System.out.print("There isn't enough space!");
            System.out.printf(" %d people in a queue!%n", peopleWaiting);
        }

        for (int i : liftLine) {

            System.out.print(i + " ");

        }

    }
}
