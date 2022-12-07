package TESTS;

public class Char_Int_test {
    public static void main(String[] args) {
        

        char ch ='A';

        int number = ch;
        char ch2 = (char)number;

        System.out.println(number); // ONLY NUMBER FORM CHAR
        System.out.println((int)ch); // CHAR CAST TO INT
        System.out.println(ch2); // ONLY CHAR FROM NUMBER
        System.out.println((char)number); // NUMBER CAST TO CHAR


    }
}
