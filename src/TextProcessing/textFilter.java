package TextProcessing;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] filter = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : filter) {
            if (text.contains(word)) {
                text = text.replace(word, repeatStr("*", word.length()));
            }
        }

        System.out.println(text);
    }

    public static String repeatStr(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;

    }

}


