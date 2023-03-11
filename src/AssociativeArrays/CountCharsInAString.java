package AssociativeArrays;

import java.util.*;

public class CountCharsInAString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<Character, Integer> result = new LinkedHashMap<>();

        String[] input = scan.nextLine().split(" ");

        for (String txt : input) {
            for (int i = 0; i < txt.length(); i++) {
                char symbol = txt.charAt(i);

                if (!result.containsKey(symbol)) {
                    result.put(symbol, 1);
                } else {
                    result.put(symbol, result.get(symbol) + 1);
                }
            }
        }

        result.forEach((key, value) -> System.out.printf("%c -> %d\n", key, value));
    }
}
