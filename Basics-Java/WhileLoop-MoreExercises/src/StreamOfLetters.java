import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isCfoundAlready = false;
        boolean isOfoundAlready = false;
        boolean isNfoundAlready = false;
        boolean isNoEnd = true;
        StringBuilder word = new StringBuilder();
        char letter;

        while (isNoEnd) {
            String inputText = scanner.nextLine();
            if (inputText.equals("End")) {
                isNoEnd=false;
                break;
            }
            letter = inputText.charAt(0);
            if ( (letter >='A' && letter <='Z') || letter >='a' && letter <='z') {

                if (isCfoundAlready && isOfoundAlready && isNfoundAlready){
                    continue;
                } else if (letter != 'c' && letter != 'o' && letter != 'n') {
                    word.append(letter);
                } else if ( (letter == 'c' && isCfoundAlready) || (letter == 'o' && isOfoundAlready) || (letter == 'n' && isNfoundAlready) ) {
                    word.append(letter);
                }

                if (letter == 'c') isCfoundAlready=true;
                if (letter == 'o') isOfoundAlready=true;
                if (letter == 'n') isNfoundAlready=true;

                if (isCfoundAlready && isOfoundAlready && isNfoundAlready) {
                    System.out.printf("%s ", word.toString());
                    isCfoundAlready=false;
                    isOfoundAlready=false;
                    isNfoundAlready=false;
                    word = new StringBuilder();
                }

            }

        }
    }
}
