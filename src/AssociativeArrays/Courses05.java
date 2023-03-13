package AssociativeArrays;

import java.util.*;

public class Courses05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, List<String>> namesAndCourses = new LinkedHashMap<>();


        while (!input.equals("end")) {

            String[] data = input.split("\\s+:\\s+");
            String course = data[0];
            String name = data[1];

            if (!namesAndCourses.containsKey(course)) {
                namesAndCourses.put(course, new ArrayList<>());
                namesAndCourses.get(course).add(name);

            } else {
                namesAndCourses.get(course).add(name);
            }


            input = scan.nextLine();

        }


//        for (Map.Entry<String, List<String>> entry : namesAndCourses.entrySet()) {
//            System.out.printf("%s: %s\n", entry.getKey(), entry.getValue().size());
//
//            for (int i = 0; i < entry.getValue().size() ; i++) {
//                System.out.printf("-- %s\n", entry.getValue().get(i));
//
//            }
//        }



        namesAndCourses.forEach((k, v) ->

                System.out.printf("%s: %s%n-- %s%n", k, v.size(), String.join("\n-- ", v)));


        //namesAndCourses.forEach((c, n) -> System.out.printf("%s => %s\n", c, n.forEach();));
    }
}
