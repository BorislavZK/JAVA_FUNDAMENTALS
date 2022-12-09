package Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

         char input = scan.nextLine().charAt(0);

         int num = (int)input;

       if (num >= 65 && num <= 90){
           System.out.println("upper-case");
       }else {
           System.out.println("lower-case");
       }

    }
}
