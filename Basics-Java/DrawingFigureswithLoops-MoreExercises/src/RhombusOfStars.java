import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.print(repeatStr(" ", n - i));
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(repeatStr(" ", n - i));
            System.out.print("*");
            for (int j = 1; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
