import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Опаковъчна хартия - 5.80 лв. за ролка
        // Плат - 7.20 лв. за ролка
        // Лепило - 1.20 лв. за литър
        double pricePaperPerRoll = 5.80;
        double priceClothPerRoll = 7.20;
        double priceGluePerLitre = 1.20;
        double totalPrice = 0;

        //От конзолата се четат 4 числа:
        // Първи ред – брой ролки опаковъчна хартия - цяло число в интервала [0...100]
        // Втори ред – брой ролки плат - цяло число в интервала [0...100]
        // Трети ред – литри лепило - реално число в интервала [0.00…50.00]
        // Четвърти ред – процент намаление - цяло число в интервала [0...100]
        int quantityPaper = Integer.parseInt(scanner.nextLine());
        int quantityCloth = Integer.parseInt(scanner.nextLine());
        double quantityGlue = Double.parseDouble(scanner.nextLine());
        int discountAmount = Integer.parseInt(scanner.nextLine());

        totalPrice = quantityPaper*pricePaperPerRoll + quantityCloth*priceClothPerRoll + quantityGlue*priceGluePerLitre;
        totalPrice = totalPrice - totalPrice*(discountAmount/100.0);

        System.out.printf("%.3f\n", totalPrice);
    }
}
