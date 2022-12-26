package Exercises;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int n = Integer.parseInt(scan.nextLine());
            int[] wagons = new int[n];
            int sum = 0;
            for (int i = 0; i <  n; i++) {
                int peoples = Integer.parseInt(scan.nextLine());
                sum += peoples;
                wagons[i] = peoples;
            }

        for (int wagon : wagons) {
            System.out.print(wagon + " ");

        }
        System.out.println();
        System.out.println(sum);

        }
    }