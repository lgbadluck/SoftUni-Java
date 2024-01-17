import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String inputText = scanner.nextLine();

        while ( !inputText.equals(password) ) {
            inputText = scanner.nextLine();
        }

        System.out.printf("Welcome %s!\n", userName);
    }
}
