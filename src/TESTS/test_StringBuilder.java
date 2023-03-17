package TESTS;

public class test_StringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("BANANA");

        String reverseStr = str.reverse().toString();


        System.out.println(reverseStr);
    }
}
