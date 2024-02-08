package ObjectsAndClassesMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RawData_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
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

            Car newCarToAdd = new Car(modelName, engineInfo, cargoInfo, tiresInfo);
            carList.add(newCarToAdd);
            n--;
        }
//        for (Car car : carList) {
//            System.out.printf("Model: %s\n\tCargoTpe: %s \n\tEngine Power: %d\n",
//                    car.getModelName(),
//                    car.getCargoInfo().getCargoType(),
//                    car.getEngineInfo().getEnginePower()
//                    );
//        }

        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            for (Car car : carList) {
                if (car.getCargoInfo().getCargoType().equals("fragile")) {
                    for (int i = 0; i < car.getTiresInfo().length; i++) {
                        if (car.getTiresInfo()[i].tirePressure < 1.0) {
                            System.out.printf("%s\n", car.getModelName());
                            break;
                        }
                    }
                }
            }
        }
        if (command.equals("flamable")) {
            for (Car car : carList) {
                if ( (car.getCargoInfo().getCargoType().equals("flamable")) && (car.getEngineInfo().getEnginePower() > 250) ) {
                    System.out.printf("%s\n", car.getModelName());
                }
            }
        }


    }

    public static class Car {
        String modelName;

        public String getModelName() {
            return modelName;
        }

        Engine engineInfo;

        public Engine getEngineInfo() {
            return engineInfo;
        }

        public Tire[] getTiresInfo() {
            return tiresInfo;
        }

        Cargo cargoInfo;

        public Cargo getCargoInfo() {
            return cargoInfo;
        }

        Tire[] tiresInfo = new Tire[4];

        public Car(String modelName, String[] engineInfo, String[] cargoInfo, String[] tiresInfo) {
            this.modelName = modelName;
            this.engineInfo = new Engine(Integer.parseInt(engineInfo[0]), Integer.parseInt(engineInfo[1]));
            this.cargoInfo = new Cargo(Integer.parseInt(cargoInfo[0]), cargoInfo[1]);
            int count = 0;
            for (int i = 0; i < this.tiresInfo.length; i++) {
                this.tiresInfo[i] = new Tire(Double.parseDouble(tiresInfo[count++]), Integer.parseInt(tiresInfo[count++]));
            }
        }
    }

    public static class Engine {
        int engineSpeed;
        int enginePower;

        public int getEnginePower() {
            return enginePower;
        }

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

    }

    public static class Cargo {
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

    public static class Tire {
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
