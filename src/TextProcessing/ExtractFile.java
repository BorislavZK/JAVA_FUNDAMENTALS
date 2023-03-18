package TextProcessing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //C:\Internal\training-internal\Template.pptx
        //File name: Template
        //File extension: pptx

        String[] input = scan.nextLine().split("\\\\");
        String fileName = input[input.length-1].split("\\.")[0];
        String fileType = input[input.length-1].split("\\.")[1];


        System.out.printf("File name: %s\n", fileName);
        System.out.printf("File extension: %s", fileType);

    }
}
