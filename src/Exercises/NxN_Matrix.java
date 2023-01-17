package Exercises;

import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        nXnMatrixz(n);

    }

    private static void nXnMatrixz (int n){
        // cols
        for (int cols = 1; cols <= n ; cols++) {
            rows(n);
            System.out.println();
        }
    }

    private static void rows (int rowsIn){
        // rows
        for (int rows = 1; rows <= rowsIn ; rows++) {
            System.out.print(rowsIn + " ");
        }

    }
}
