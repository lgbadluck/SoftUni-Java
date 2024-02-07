package ObjectsAndClassesMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n>0) {
            String[] input = scanner.nextLine().split(" ");
            String modelName = input[0];
            String[] engineInfo = {input[1], input[2]};
            String[] cargoInfo = {input[3], input[4]};
            String[] tiresInfo = {
                    input[5], input[6],
                    input[7], input[8],
                    input[9], input[10],
                    input[11], input[12],
            };

            Car newCarToAdd = new Car (modelName, engineInfo, cargoInfo, tiresInfo);
            n--;
        }
        for (Car car : carList) {
            System.out.printf("%s", car.modelName);
        }

    }

    public static class Car {
        String modelName;
        Engine engineInfo;
        Cargo  cargoInfo;
        Tire[] tiresInfo = new Tire[4];

        public Car(String modelName, String[] engineInfo, String[] cargoInfo, String[] tiresInfo) {
        //public Car(String[] input) {
//            String modelName = input[0];
//            String[] engineInfo = {input[1], input[2]};
//            String[] cargoInfo = {input[3], input[4]};
//            String[] tiresInfo = {
//                    input[5], input[6],
//                    input[7], input[8],
//                    input[9], input[10],
//                    input[11], input[12],
//            };
            this.modelName = modelName;
            this.engineInfo = new Engine(Integer.parseInt(engineInfo[0]), Integer.parseInt(engineInfo[0]));
            this.cargoInfo = new Cargo(Integer.parseInt(cargoInfo[0]), cargoInfo[1]);
            int count = 0;
            for (int i = 0; i < tiresInfo.length; i++) {
                this.tiresInfo[i] = new Tire (Double.parseDouble(tiresInfo[count++]), Integer.parseInt(tiresInfo[count++]));
            }
        }
    }

    public class Engine {
        int engineSpeed;
        int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

    }

    public class Cargo {
        int    cargoWeight;
        String cargoType;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }

        public String getCargoType() {
            return cargoType;
        }
    }

    public class Tire {
        double tirePressure;
        int    tireAge;

        public Tire(double tirePressure, int tireAge) {
            this.tirePressure = tirePressure;
            this.tireAge = tireAge;
        }

        public double getTirePressure() {
            return tirePressure;
        }
    }
}
