import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + (paint*0.1)) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double allPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;

        double wages = (allPrice * 0.30) * hours;

        System.out.println(wages + allPrice);
    }
}
