package ClassesAndObjects;

public class testStudents {

    static class Student {
        private int id;
        private String name;
        private int age;


        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        String getInfo() {
            return this.id + " " + this.age + " " + this.name;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {


        Student studentOne = new Student(123456, "Bobi", 22);

        System.out.println(studentOne.getInfo());
        System.out.println(studentOne.getName() + " " + studentOne.getId());
        System.out.println(studentOne.name);


        // System.out.println(studentTwo.getInfo());


    }


}
