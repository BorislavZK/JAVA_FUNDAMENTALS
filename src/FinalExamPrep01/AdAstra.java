package FinalExamPrep01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        //String regex = "(#?\\|?)(?<meal>[A-Za-z ]+)(?:\\1)(?<expdate>\\d{2}\\/\\d{2}\\/\\d{2})(?:\\1)(?<cal>\\d+)\\1";
        //String regex = "([#\\\\|])(?<meal>[A-Z][a-z ]+)\\1(?<expdate>[\\d]{2}[\\/][\\d]{2}[\\/][\\d]{2})\\1(?<cal>[0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|10000)\\1";
        String regex = "([#\\\\|]|)(?<meal>[A-Z]+[A-Za-z ]+)\\1(?<expdate>[\\d]{2}[\\/][\\d]{2}[\\/][\\d]{2})\\1(?<cal>[0-9]|[0-9][0-9]|[0-9][0-9][0-9]|[0-9][0-9][0-9][0-9]|10000)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Map<String, List<String>> foodMap = new LinkedHashMap<>();

        int totalCalories = 0;

        while (matcher.find()) {
            String currentMeal = matcher.group("meal");
            String expDate = matcher.group("expdate");
            String currentCalories = matcher.group("cal");

            totalCalories += Integer.parseInt(currentCalories);

            foodMap.putIfAbsent(currentMeal, new ArrayList<>());
            foodMap.get(currentMeal).add(expDate);
            foodMap.get(currentMeal).add(currentCalories);

        }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!\n", days);
        for (Map.Entry<String, List<String>> entry : foodMap.entrySet()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
