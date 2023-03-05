package ClassesAndObjects.Students;

public class Students {

    //first name (string), last name (string), and grade (a floating-point number).

    String name;
    String lastName;
    double grade;

    public Students(String name, String lastName, double grade) {
        this.name = name;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        //"{first name} {second name}: {grade}".
        return String.format("%s %s: %.2f", name, lastName, grade);
    }
}
