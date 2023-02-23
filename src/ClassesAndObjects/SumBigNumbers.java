package ClassesAndObjects;

import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scan.nextLine());
        BigInteger secondNum = new BigInteger(scan.nextLine());

        BigInteger result = firstNum.add(secondNum);

        System.out.println(result);

    }
}
