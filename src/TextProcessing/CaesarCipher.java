package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        String encryptedText = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            char encryptedChar = (char) (currentChar + 3);
            encryptedText += encryptedChar;

        }

        System.out.println(encryptedText);

    }
}
