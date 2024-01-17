import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerYear = Integer.parseInt(scanner.nextLine());

        double sneakers = pricePerYear - (pricePerYear * 0.40);
        double outfit = sneakers - (sneakers * 0.20);
        double basketball = outfit * 0.25;
        double accessories = basketball * 0.20;

        double totalPrice = pricePerYear + sneakers + outfit + basketball + accessories;

        System.out.println(totalPrice);
    }
}
