package TESTS;

import java.util.Scanner;

public class FavouriteMovieBobi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String selectedMovie = "";
        int maximumScore = Integer.MIN_VALUE;
        int counter = 0;
        while (!input.equals("STOP")) {
            int totalSum = 0;
            counter++;
            if(counter == 7){
                System.out.println("The limit is reached.");
                break;
            }
           // int wordLength = input.length();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
//                if (Character.isWhitespace(ch)){
//                    continue;
//                }

                //ch != 32

                int charNumber = ch;
                if (Character.isUpperCase(ch) && !Character.isWhitespace(ch)) {
                    charNumber -= input.length();
                } else if (Character.isLowerCase(ch) && !Character.isWhitespace(ch)){
                    charNumber -= (input.length() * 2);
                }

                totalSum += charNumber;
            }
            if (totalSum > maximumScore) {
                maximumScore = totalSum;
                selectedMovie = input;
            }
            input = scan.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", selectedMovie, maximumScore);

    }
}