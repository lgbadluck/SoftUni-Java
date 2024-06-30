package _03_InheritanceExercise._04_NeedForSpeed;

public class Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 1.25;
    double fuelConsumption;
    double fuel;
    int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    private void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void drive(double distanceInKM) {
        double fuelNeeded = distanceInKM * fuelConsumption;

        if (fuel >= fuelNeeded) {
            this.fuel -= fuelNeeded;
        } else {
            System.out.println("Not enough fuel to travel this distance.");
        }
    }
}
