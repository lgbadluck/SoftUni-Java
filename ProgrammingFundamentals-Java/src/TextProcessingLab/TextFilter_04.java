package TextProcessingLab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String textToEdit = scanner.nextLine();

        for(String word : bannedWords) {
            String replaceWith = "*".repeat(word.length());
            textToEdit = textToEdit.replace(word, replaceWith);
        }

        System.out.println(textToEdit);
    }
}
