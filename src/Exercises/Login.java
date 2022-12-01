package Exercises;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }

        int failed = 0;
        String enteredPassword = scan.nextLine();

        while (!enteredPassword.equals(password)) {

            failed++;

            if (failed == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            System.out.println("Incorrect password. Try again.");

            enteredPassword = scan.nextLine();

        }

        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }

    }
}
