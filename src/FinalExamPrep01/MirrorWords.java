package FinalExamPrep01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("([#@])(?<firstWord>[a-zA-Z]{3,})\\1([#@])(?<secondWord>[a-zA-Z]{3,})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> mirrorWordsList = new ArrayList<>();

        int wordCounter = 0;
        int mirrorCounter = 0;

        while (matcher.find()) {

            wordCounter++;
            StringBuilder firstWord = new StringBuilder(matcher.group("firstWord"));
            StringBuilder secondWord = new StringBuilder(matcher.group("secondWord"));

            if (firstWord.toString().equals(secondWord.reverse().toString())) {
                mirrorCounter++;
                //{wordOne} <=> {wordtwo},
                String entry = firstWord + " <=> " + secondWord.reverse();
                mirrorWordsList.add(entry);
            }
        }

        if (wordCounter > 0) {
            System.out.printf("%d word pairs found!\n", wordCounter);
        }else {
            System.out.println("No word pairs found!");
        }

        if (mirrorCounter > 0) {
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWordsList));
        } else {
            System.out.println("No mirror words!");
        }

    }
}
