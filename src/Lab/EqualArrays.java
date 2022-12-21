package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arrayOne = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] arrayTwo = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int index = 0;
        boolean flag = true;
        for (int i = 0; i < arrayOne.length ; i++) {
            int firstNum = arrayOne[i];
            int secondNum = arrayTwo[i];

            if ( firstNum == secondNum){
                sum += firstNum;
            }else{
                index = i;
                flag = false;
                break;
            }

        }

        if (flag){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }


    }
}
