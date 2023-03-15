package TextProcessing;

import java.util.Scanner;

public class reverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder word = new StringBuilder(scan.nextLine());

        while (!word.toString().equals("end")){

        StringBuilder reverse = new StringBuilder(word).reverse();
        System.out.println(word + " = " + reverse);
        word = new StringBuilder(scan.nextLine());

        }
    }
}
