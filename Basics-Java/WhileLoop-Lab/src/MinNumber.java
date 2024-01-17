import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        String inputText = scanner.nextLine();
        int number;

        while ( !inputText.equals("Stop") ) {
            number = Integer.parseInt(inputText);
            if (number <= min) {
                min = number;
            }
            inputText = scanner.nextLine();
        }

        System.out.println(min);
    }
}
