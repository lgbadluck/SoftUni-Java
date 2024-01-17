import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flowerType1 = Integer.parseInt(scanner.nextLine());
        int flowerType2 = Integer.parseInt(scanner.nextLine());
        int flowerType3 = Integer.parseInt(scanner.nextLine());
        int flowerType4 = Integer.parseInt(scanner.nextLine());
        double priceOfGift = Double.parseDouble(scanner.nextLine());

        double profitFromOrder = flowerType1*3.25 + flowerType2*4.0 + flowerType3*3.50 + flowerType4*8.0;
        profitFromOrder-= profitFromOrder*0.05;

        if (priceOfGift <= profitFromOrder) {
            System.out.printf("She is left with %.0f leva.\n", Math.floor(profitFromOrder-priceOfGift) );
        } else
            System.out.printf("She will have to borrow %.0f leva.\n", Math.ceil(priceOfGift-profitFromOrder) );

    }
}
