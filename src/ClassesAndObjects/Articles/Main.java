package ClassesAndObjects.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(", ");
        String title = line[0];
        String content = line[1];
        String author = line[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < n ; i++) {

            String[] command = scan.nextLine().split(": ");

            switch (command[0]){

                case "Edit":
                    article.setContent(command[1]);
                    break;

                case "ChangeAuthor":
                    article.setAuthor(command[1]);
                    break;

                case "Rename":
                    article.setTitle(command[1]);
                    break;
            }

        }


        System.out.println(article);


    }
}
