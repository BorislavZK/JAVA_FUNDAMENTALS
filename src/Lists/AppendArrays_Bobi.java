package Lists;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays_Bobi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arrays = Arrays.stream(scan.nextLine().split("\\|")).collect(Collectors.toList());

        Collections.reverse(arrays);


    }
}
