import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        //System.out.println("Hello, " + name + "!");
        //System.out.printf("Hello, %s!\n", name);
        System.out.printf("Hello, %s!%n", name);
    }
}
