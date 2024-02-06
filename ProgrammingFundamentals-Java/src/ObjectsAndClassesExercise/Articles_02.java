package ObjectsAndClassesExercise;

import java.util.Scanner;

public class Articles_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] article = scanner.nextLine().split(", ");
        Article newArticle = new Article(article[0], article[1], article[2]);

        int n = Integer.parseInt(scanner.nextLine());
        while (n>0) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0];
            String toUpdate = "";
            for (int i = 1; i < input.length; i++) {
                if (i!=input.length-1) toUpdate+= input[i] + " ";
                else toUpdate+= input[i];
            }

            switch (command) {
                case "Edit:": newArticle.Edit(toUpdate); break;
                case "ChangeAuthor:": newArticle.ChangeAuthor(toUpdate); break;
                case "Rename:": newArticle.Rename(toUpdate); break;
            }

            n--;
        }
        System.out.println(newArticle.toString());

    }

    public static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
        public void Edit (String newContent) {
            this.setContent(newContent);
        }
        public void ChangeAuthor (String newAuthor) {
            this.setAuthor(newAuthor);
        }
        public void Rename(String newTitle) {
            this.setTitle(newTitle);
        }
    }
}
