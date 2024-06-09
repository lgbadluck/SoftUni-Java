package DefiningClassesLabs;

import java.util.Scanner;

public class _01_MainCarInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];
            String model = data[1];
            int horsePower = Integer.parseInt(data[2]);

            _01_CarInfo car = new _01_CarInfo();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            System.out.println(car.getInfo());
        }
    }
}
