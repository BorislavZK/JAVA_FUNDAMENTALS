package ClassesAndObjects.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Students> studentsList = new ArrayList<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            String[] line = scan.nextLine().split(" ");
            String firstName = line[0];
            String lastName = line[1];
            double grade = Double.parseDouble(line[2]);

            Students student = new Students(firstName, lastName, grade);
            studentsList.add(student);

        }

        studentsList.sort(Comparator.comparingDouble(Students::getGrade).reversed());

        for (Students students : studentsList) {
            System.out.println(students);

        }
    }
}
