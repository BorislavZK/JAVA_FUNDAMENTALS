package TESTS;

public class test_LastIndexOf {
    public static void main(String[] args) {


        String animals = "dog, cat, bird, dog";

        System.out.println(animals.indexOf("dog"));
        System.out.println(animals.lastIndexOf("dog"));
        System.out.println(animals.lastIndexOf("mouse"));

        System.out.println(animals.replace("dog", "xxx"));

        System.out.println();
        System.out.println("StringBuilder");
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append("def");
        sb.insert(3, " xxx "); // insert xxx
        sb.replace(4,7, "BBB"); //replace xxx with BBB
        


        System.out.println(sb);
        String sbToSting = sb.toString();
        System.out.println(sbToSting + " IS A STRING");

    }
}
