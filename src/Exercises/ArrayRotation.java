package Exercises;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = scan.nextLine().split(" ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String firsElement = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = firsElement;

        }

        System.out.println(String.join(" ", arr));


    }
}
