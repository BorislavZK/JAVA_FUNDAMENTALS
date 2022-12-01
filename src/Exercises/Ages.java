package Exercises;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int age = Integer.parseInt(scan.nextLine());
        String type = "";

        //•	0-2 – baby;
        //•	3-13 – child;
        //•	14-19 – teenager;
        //•	20-65 – adult;
        //•	>=66 – elder;
        //•	All the values are inclusive.


        if (age >= 0 && age <= 2) {
            type = "baby";
        } else if (age >= 3 && age <= 13) {
            type = "child";
        } else if (age >= 14 && age <= 19) {
            type = "teenager";
        } else if (age >= 20 && age <= 65) {
            type = "adult";
        } else if (age >= 66){
            type = "elder";
        }

        System.out.println(type);
    }
}
