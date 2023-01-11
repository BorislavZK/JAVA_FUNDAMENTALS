package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word  = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());

        String result2 = repeatSting(word, n);
        System.out.println(result2);
    }

    private static String repeatSting ( String str, int n){
        String result = "";
        for (int i = 1; i <= n ; i++) {
            result += str;
        }
        return result;
    }
}
