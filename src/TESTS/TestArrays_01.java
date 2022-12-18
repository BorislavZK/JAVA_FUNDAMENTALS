package TESTS;

public class TestArrays_01 {
    public static void main(String[] args) {


        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] += i + 10;

        }

        System.out.println("" + numbers[0] + " " + numbers[1] + " " + numbers[2] );


    }
}

