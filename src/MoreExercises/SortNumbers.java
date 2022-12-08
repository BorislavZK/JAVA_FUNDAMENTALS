package MoreExercises;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        if (first > second && first > third) {
            System.out.println(first);
            if (second > third) {
                System.out.println(second);
                System.out.println(third);
            } else {
                System.out.println(third);
                System.out.println(second);
            }
        } else if (second > first && second > third) {
            System.out.println(second);
            if (first>third){
                System.out.println(first);
                System.out.println(third);
            }else {
                System.out.println(third);
                System.out.println(first);
            }
        }else if (third > first && third > second){
            System.out.println(third);
            if(first>second){
                System.out.println(first);
                System.out.println(second);
            }else {
                System.out.println(second);
                System.out.println(first);
            }
        }

    }
}
