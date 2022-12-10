package Lab;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        byte centuries = Byte.parseByte(scan.nextLine());
        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",
                centuries, years, days, hours, minutes);
        

    }
}
