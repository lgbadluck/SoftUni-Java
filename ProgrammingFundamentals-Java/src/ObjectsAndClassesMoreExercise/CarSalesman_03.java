package ObjectsAndClassesMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSalesman_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        while (n > 0) {
            String[] input = scanner.nextLine().split(" ");
            Engine engineToAdd = new Engine(input);
            engineList.add(engineToAdd);
            n--;
        }
        //Debug Print all Engines
//        for (Engine engine : engineList) {
//            System.out.println(engine);
//        }

        n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        while (n > 0) {
            String[] input = scanner.nextLine().split(" ");
            String thisCarEngineModel = input[1];
            for (Engine engine : engineList) {
                if (engine.getModel().equals(thisCarEngineModel)) {
                    Car carToAdd = new Car(engine, input);
                    carList.add(carToAdd);
                }
            }
            n--;
        }
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    public static class Car {
        String name;
        Engine engineInfo;
        String weight = "n/a";
        String color  = "n/a";

        public Engine getEngineInfo() {
            return engineInfo;
        }

        @Override
        public String toString() {
            return  name + ":" +
                    getEngineInfo().toString() +
                    "\n  Weight: " + weight +
                    "\n  Color: " + color;
        }

        public Car(Engine engineInfo, String[] input) {
            this.name = input[0];
            this.engineInfo = engineInfo;
            if (input.length >= 3) {
                if (input[2].matches("\\D+")) this.color  = input[2];
                else                                this.weight = input[2];
            }
            if (input.length >= 4) this.color = input[3];
        }
    }

    public static class Engine {
        String model;
        int    power;
        String displacement = "n/a";
        String efficiency   = "n/a";

        public String getModel() {
            return model;
        }

        public int getPower() {
            return power;
        }

        public String getDisplacement() {
            return displacement;
        }

        public String getEfficiency() {
            return efficiency;
        }

        @Override
        public String toString() {
            return "\n  " + model + ":" +
                    "\n    Power: " + power +
                    "\n    Displacement: " + displacement +
                    "\n    Efficiency: " + efficiency;
        }

        public Engine(String[] input) {
            this.model = input[0];
            this.power = Integer.parseInt(input[1]);
            if (input.length >= 3) {
                if (input[2].matches("\\D+"))  this.efficiency     = input[2];
                else                            this.displacement   = input[2];
            }
            if (input.length >= 4) this.efficiency = input[3];
        }
    }
}
