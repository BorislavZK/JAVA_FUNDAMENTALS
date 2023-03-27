package FinalExamPrep01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        //([::]{2}|[**]{2})[A-Z][a-z]+\1

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        long threshold = getThreshold(input);

        Pattern pattern = Pattern.compile("[:][:][A-Z][a-z]{2,}[:][:]|[*][*][A-Z][a-z]{2,}[*][*]");
        //Pattern pattern = Pattern.compile(" ([::]{2}|[**]{2})(?<emoji>[A-Z][a-z]+)\\1");

        Matcher matcher = pattern.matcher(input);

        int emojiCounter = 0;

        List<String> coolEmojis = new ArrayList<>();

        while (matcher.find()) {

            emojiCounter++;

            String currentEmoji = matcher.group();
            int currentEmojiSum = 0;
            for (int i = 0; i < currentEmoji.length(); i++) {
                if (currentEmoji.charAt(i) != ':' && currentEmoji.charAt(i) != '*') {
                    currentEmojiSum += currentEmoji.charAt(i);
                }
            }

            if (currentEmojiSum > threshold) {
                coolEmojis.add(matcher.group());

            }

        }

        System.out.printf("Cool threshold: %d\n", threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", emojiCounter);

        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }


    }

    private static long getThreshold(String input) {
        int result = 1;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                result *= Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return result;
    }
}
