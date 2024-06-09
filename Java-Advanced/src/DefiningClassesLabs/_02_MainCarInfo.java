package DefiningClassesLabs;

import java.util.Scanner;

public class _02_MainCarInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];

            _02_CarInfo car;
            if (data.length == 1) {
                car = new _02_CarInfo(brand);
            } else {
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                car = new _02_CarInfo(brand, model, horsePower);
            }

            System.out.println(car);
        }
    }
}
