import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int higth = Integer.parseInt(scanner.nextLine());
        double procentOther = Double.parseDouble(scanner.nextLine());

        int volumeInCm = length * width * higth;
        double volumeLitres = (double) volumeInCm / 1000;
        double volumeWater = volumeLitres * (1 - (procentOther/100));

        System.out.println(volumeWater);
    }
}
