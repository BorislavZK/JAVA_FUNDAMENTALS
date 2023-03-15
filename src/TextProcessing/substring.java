package TextProcessing;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filter = scan.nextLine();
        String word = scan.nextLine();

        int index = word.indexOf(filter);

        while (index != -1){
            word = word.replace(filter, "");
            index = word.indexOf(filter);
        }

        System.out.println(word);
    }
}
