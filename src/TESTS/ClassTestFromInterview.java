package TESTS;

public class ClassTestFromInterview {

    static class MyClass{

        public static String login(String... credentials){
            int loginType = credentials.length;
            String username = "";
            String password = "";
            switch (loginType){
                case 2: {
                    username = credentials[0];
                    password = credentials[1];
                }
                break;

                case 4:{
                    username = String.format("%s_%s@%s.com", credentials[0], credentials[1], credentials[2]);
                    password = credentials[3];
                }
                break;
                default: {
                    username = "User";
                    password = "secret123";
                }

            }
            return "Login as: " + username + " | " + password;
        }

        public static void main(String[] args) {
            System.out.println(login());
            System.out.println(login("Bobi", "Konstantinov"));
            System.out.println(login("Bobi", "konstantinov", "gmail", "Parolaaa"));
        }
    }
}
