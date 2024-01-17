import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        char startLetter = inputText.charAt(0);
        inputText = scanner.nextLine();
        char endLetter = inputText.charAt(0);
        inputText = scanner.nextLine();
        char excludeLetter = inputText.charAt(0);
        int counter = 0;

        for (char letter1 = startLetter; letter1 <= endLetter; letter1++) {
            if (letter1 == excludeLetter) continue;
            for (char letter2 = startLetter; letter2 <= endLetter; letter2++) {
                if (letter2 == excludeLetter) continue;
                for (char letter3 = startLetter; letter3 <= endLetter; letter3++) {
                    if (letter3 == excludeLetter) continue;
                    System.out.printf("%c%c%c ", letter1, letter2, letter3);
                    counter++;
                }
            }
        }
        System.out.printf("%d\n", counter);
    }
}
