package Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        while (true){
            if (num % 2 == 0 ){
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            }else {
                System.out.printf("Please write an even number.\n");
                num = Integer.parseInt(scan.nextLine());
            }

        }



    }
}
