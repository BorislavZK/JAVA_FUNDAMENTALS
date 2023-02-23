package ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students05 {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String hometown;


        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> StudentsList = new ArrayList<>();
        String input = scan.nextLine();

        while (!input.equals("end")) {

            String[] studentInfo = input.split("\\s+");

            Student currentStudent = new Student(studentInfo[0], studentInfo[1],
                    studentInfo[2], studentInfo[3]);

            StudentsList.add(currentStudent);

            input = scan.nextLine();
        }

        String searchTown = scan.nextLine();

        for (Student student : StudentsList) {

            if (student.getHometown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }

        }

    }
}
