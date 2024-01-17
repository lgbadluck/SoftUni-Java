import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numDog = Integer.parseInt(scanner.nextLine());
        int numCat = Integer.parseInt(scanner.nextLine());

        double dogPrice = numDog * 2.50;
        double catPrice = numCat * 4;
        double finalPrice = catPrice + dogPrice;

        System.out.printf("%.1f lv.", finalPrice);
    }
}
