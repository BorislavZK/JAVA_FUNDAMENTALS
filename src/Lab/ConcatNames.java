package Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName = scan.nextLine();
        String secondName = scan.nextLine();
        String deli = scan.nextLine();

        System.out.printf("%s%s%s", firstName, deli, secondName);
    }
}
