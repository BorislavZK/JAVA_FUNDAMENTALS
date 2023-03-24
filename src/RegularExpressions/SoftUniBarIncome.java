package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double total = 0;
        String input = scan.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.0-9]*(?<price>[0-9]+\\.?[0-9]*)\\$";

        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {

                int quantity = Integer.parseInt(matcher.group("quantity"));
                double articlePrice = Double.parseDouble(matcher.group("price"));
                String currentName = matcher.group("name");
                double currentPrice = articlePrice * quantity;
                String currentProduct = matcher.group("product");
                //Peter: Gum - 1.30
                System.out.printf("%s: %s - %.2f\n", currentName, currentProduct, currentPrice);

                total += currentPrice;

            }

            input = scan.nextLine();

        }

        System.out.printf("Total income: %.2f", total);
    }
}