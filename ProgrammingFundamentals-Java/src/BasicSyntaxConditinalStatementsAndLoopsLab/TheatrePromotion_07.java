package BasicSyntaxConditinalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        switch (typeOfDay) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    System.out.println("12$\n");
                }
                else if (age > 18 && age <=64) {
                    System.out.println("18$\n");
                }
                else if (age > 64 && age <=122) {
                    System.out.println("12$\n");
                } else System.out.println("Error!\n");
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    System.out.println("15$\n");
                }
                else if (age > 18 && age <=64) {
                    System.out.println("20$\n");
                }
                else if (age > 64 && age <=122) {
                    System.out.println("15$\n");
                } else System.out.println("Error!\n");
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    System.out.println("5$\n");
                }
                else if (age > 18 && age <=64) {
                    System.out.println("12$\n");
                }
                else if (age > 64 && age <=122) {
                    System.out.println("10$\n");
                } else System.out.println("Error!\n");
                break;
            default:
                System.out.println("Error!\n");
                break;
        }
    }
}
