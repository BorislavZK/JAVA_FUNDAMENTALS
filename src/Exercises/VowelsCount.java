package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().toLowerCase();


        vowelsCounter(input);


    }

    private static void vowelsCounter (String word){
        // A,E,I,O,U
        int count = 0;

        for (char symbol : word.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
                count ++;
            }

        }

        System.out.println(count);

    }
}
