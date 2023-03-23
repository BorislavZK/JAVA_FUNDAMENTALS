package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture01RegExExercise {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[\\d]+.?[\\d]*)!(?<quantity>[\\d]+)";

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new ArrayList<>();

        double totalPrice = 0;

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furniture");
                double currentPrice = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                totalPrice += currentPrice * quantity;

            }
            input = scan.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
