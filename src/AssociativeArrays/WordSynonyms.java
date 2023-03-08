package AssociativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> wordsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList<>());
                wordsMap.get(word).add(synonym);
            } else {
                wordsMap.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {

            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }

        scan.close();

    }
}
