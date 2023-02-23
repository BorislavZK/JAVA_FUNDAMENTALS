package ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2006 {

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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<>();
        String input = scan.nextLine();

        while (!input.equals("end")) {

            String[] studentInfo = input.split("\\s+");

            Student currentStudent = new Student(studentInfo[0], studentInfo[1],
                    studentInfo[2], studentInfo[3]);

            if (isStudentExisting(studentsList, studentInfo[0], studentInfo[1])) {
                Student student = getStudent(studentsList, studentInfo[0], studentInfo[1]);

                student.setFirstName(studentInfo[0]);
                student.setLastName(studentInfo[1]);
                student.setAge(studentInfo[2]);
                student.setHometown(studentInfo[3]);

            } else {
                studentsList.add(currentStudent);
            }




            input = scan.nextLine();
        }

        String searchTown = scan.nextLine();

        for (Student student : studentsList) {
            if (student.getHometown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }

        }

    }


    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;

            }

        }

        return existingStudent;

    }
}
