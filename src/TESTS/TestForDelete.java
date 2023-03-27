package TESTS;

public class TestForDelete {
    public static void main(String[] args) {


        String input = "Drive : Audi A6 : 543 : 47";

        String[] test = input.split(" : ");

        System.out.println(String.join(",", test));
    }
}
