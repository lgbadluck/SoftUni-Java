package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumTruckHP = 0;
        int sumCarHP = 0;
        int countTrucks = 0;
        int countCars = 0;

        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] vehicleDate = input.split(" ");
            Vehicle vehicleToAdd = new Vehicle(vehicleDate[0], vehicleDate[1], vehicleDate[2], Integer.parseInt(vehicleDate[3]));
            vehicleList.add(vehicleToAdd);

            input = scanner.nextLine();
        }

        String inputModel = scanner.nextLine();
        while (!inputModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(inputModel)) {
                    vehicle.printInfo();
                }

            }
            inputModel = scanner.nextLine();
        }

        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("Car")) {
                sumCarHP += vehicle.getHorsePower();
                countCars++;
            } else if (vehicle.getType().equals("Truck")) {
                sumTruckHP += vehicle.getHorsePower();
                countTrucks++;
            }
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n", ((countCars!=0 ) ? ((double) sumCarHP / countCars) : 0.0) );
        System.out.printf("Trucks have average horsepower of: %.2f.\n",  ((countTrucks!=0 ) ? ((double) sumTruckHP / countTrucks) : 0.0) );

    }

    public static class Vehicle {
        private String type;
        private String model;
        private String color;
        private int    horsePower;

        public void printInfo() {
            System.out.printf("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d\n",
                    this.type, this.model, this.color, this.horsePower);
            return;
        }

        public Vehicle(String type, String model, String color, int horsePower) {
            if (type.equals("truck")) this.type = "Truck";
            if (type.equals("car")) this.type = "Car";
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }
    }
}
