package TextProcessingMoreExercise;

import java.util.Scanner;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String titleName = scanner.nextLine();
        System.out.printf("<h1>\n\t%s\n</h1>\n", titleName);
        String articleContent = scanner.nextLine();
        System.out.printf("<article>\n\t%s\n</article>\n", articleContent);

        String inputComment = scanner.nextLine();
        while (!inputComment.equals("end of comments")) {
            System.out.printf("<div>\n\t%s\n</div>\n", inputComment);
            inputComment = scanner.nextLine();
        }

    }
}
