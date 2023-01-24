package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numList.size() ; i++) {

            int currentNum = numList.get(i);

            if (currentNum < 0){

                numList.remove(i);

                i=-1;
            }

        }

        if (numList.isEmpty()){
            System.out.print("empty");
        }else{
            Collections.reverse(numList);

            for (int i = 0; i < numList.size(); i++) {
                System.out.print(numList.get(i) + " ");

            }
        }
    }
}
