import java.util.Scanner;

public class AgeAndSex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if (age >= 16) {
            if (sex.equals("m")) {
                System.out.println("Mr.");
            }
            else if (sex.equals("f")) {
                System.out.println("Ms.");
            }
        }
        else {
            if (sex.equals("m")) {
                System.out.println("Master");
            }
            else if (sex.equals("f")) {
                System.out.println("Miss");
            }
        }
    }
}
