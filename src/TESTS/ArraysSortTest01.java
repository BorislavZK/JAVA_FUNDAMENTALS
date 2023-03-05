package TESTS;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class ArraysSortTest01 {
    public static void main(String[] args) {

        Integer[] array = {6,1,8,7,10,0,5,4,3,2,9};
        System.out.println("Old order");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("New order - Ascending");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("New order - Descending");
        System.out.println(Arrays.toString(array));

        
    }
}
