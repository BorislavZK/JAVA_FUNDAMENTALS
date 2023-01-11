package Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double widthInput = Double.parseDouble(scan.nextLine());
        double lengthInput = Double.parseDouble(scan.nextLine());

        double area = rectangleArea(widthInput, lengthInput);

        System.out.printf("%.0f",area);


    }

    public static double rectangleArea(double width, double length ){
        double area = width * length;

        return area;


    }
}
