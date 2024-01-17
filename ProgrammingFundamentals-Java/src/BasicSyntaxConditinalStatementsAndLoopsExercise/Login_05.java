package BasicSyntaxConditinalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = 0; i < userName.length(); i++) {
            password = userName.charAt(i) + password;
        }

        //System.out.println("Reversed string: "+ password);

        boolean isLogged = false;
        int i = 1;
        while (i < 4) {
            i++;
            String input = scanner.nextLine();
            if (input.equals(password)) {
                System.out.printf("User %s logged in.\n", userName);
                isLogged = true;
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", userName);
        }
    }
}
