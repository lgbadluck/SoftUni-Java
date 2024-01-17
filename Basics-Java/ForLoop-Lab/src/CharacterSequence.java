import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        for (int i=0; i<inputString.length(); i++) {
            char symbol = inputString.charAt(i);
            System.out.println(symbol);
        }
    }
}
