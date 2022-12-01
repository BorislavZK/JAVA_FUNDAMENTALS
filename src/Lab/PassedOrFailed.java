package Lab;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double score = Double.parseDouble(scan.nextLine());

        if (score >= 3.00){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }
    }
}
