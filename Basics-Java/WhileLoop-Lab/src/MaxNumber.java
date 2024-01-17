import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        String inputText = scanner.nextLine();
        int number;

        while ( !inputText.equals("Stop") ) {
            number = Integer.parseInt(inputText);
            if (number >= max) {
                max = number;
            }
            inputText = scanner.nextLine();
        }

        System.out.println(max);
    }
}
