import java.util.Scanner;

public class LocalStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia": price = 0.50; break;
                    case "Plovdiv":  price = 0.40; break;
                    case "Varna": price = 0.45; break;
                    default: System.out.println("Error"); break;
                } break;
            case "water":
                switch (city) {
                    case "Sofia": price = 0.80; break;
                    case "Plovdiv": price = 0.70; break;
                    case "Varna": price = 0.70; break;
                    default: System.out.println("Error"); break;
                } break;
            case "beer":
                switch (city) {
                    case "Sofia": price = 1.20; break;
                    case "Plovdiv": price = 1.15; break;
                    case "Varna": price = 1.10; break;
                    default: System.out.println("Error"); break;
                } break;
            case "sweets":
                switch (city) {
                    case "Sofia": price = 1.45; break;
                    case "Plovdiv": price = 1.30; break;
                    case "Varna": price = 1.35; break;
                    default: System.out.println("Error"); break;
                } break;
            case "peanuts":
                switch (city) {
                    case "Sofia": price = 1.60; break;
                    case "Plovdiv": price = 1.50; break;
                    case "Varna": price = 1.55; break;
                    default: System.out.println("Error"); break;
                } break;
            default: System.out.println("Error"); break;
        }
        System.out.println((count*price));
    }
}
