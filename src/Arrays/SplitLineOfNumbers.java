package Arrays;

import java.util.Scanner;

public class SplitLineOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String lineOfNumbers = scan.nextLine(); // input 10 20 30 ... etc
        String[] numbersAsStrings = lineOfNumbers.split(" "); // separate by spaces ("\\s+") - regex


    }
}
