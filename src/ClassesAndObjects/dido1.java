package ClassesAndObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dido1 {

	static class Student {
		static String firstName;
		static String lastName;
		static String age;
		static String hometown;

		public Student(String firstName, String lastName, String age, String hometown) {
			Student.firstName = firstName;
			Student.lastName = lastName;
			Student.age = age;
			Student.hometown = hometown;
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

		// Comment out the row below when using manual input 
		populateStudents(StudentsList);

/*		String input = scan.nextLine();
		while (!input.equals("end")) {

			String[] studentInfo = input.split("\\s+");

			Student currentStudent = new Student(studentInfo[0], studentInfo[1], studentInfo[2], studentInfo[3]);

			StudentsList.add(currentStudent);

			input = scan.nextLine();
		}*/

		String searchTown = scan.nextLine();

		for (Student student : StudentsList) {

			if (student.getHometown().equals(searchTown)) {
				System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(),
						student.getAge());
			}

		}

	}

	private static void populateStudents(List<Student> StudentsList) {
		StudentsList.add(new Student("John", "Smith", "15", "Sofia"));
		StudentsList.add(new Student("Peter", "Ivanov", "14", "Plovdiv"));
		StudentsList.add(new Student("Linda", "Bridge", "16", "Sofia"));
		StudentsList.add(new Student("Simone", "Stone", "12", "Varna"));

		System.out.println("Adding to Student List:");

		for (Student student : StudentsList) {
			System.out.println(Student.firstName + " " + Student.lastName + " " + Student.age + " " + Student.hometown);
		}
	}
}