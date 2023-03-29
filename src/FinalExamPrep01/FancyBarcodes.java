package FinalExamPrep01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();
            Matcher matcher = Pattern.compile("^@#+[A-Z][A-Za-z\\d]{4,}[A-Z]@#+").matcher(input);
            //[@][#]+(?<productcode>[A-Za-z0-9]{6,})[@][#]+     - wrong

            String group = "";

            if (matcher.find()) {
                String barcodeToProcess = matcher.group();

                for (int j = 0; j < barcodeToProcess.length(); j++) {
                    if (Character.isDigit(barcodeToProcess.charAt(j))) {
                        group += barcodeToProcess.charAt(j);
                    }
                }

                if (group.equals("")) {
                    group = "00";
                }

                System.out.printf("Product group: %s\n", group);


            } else {
                System.out.println("Invalid barcode");
            }


        }


    }
}
