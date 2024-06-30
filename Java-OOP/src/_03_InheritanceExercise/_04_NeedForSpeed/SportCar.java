package _03_InheritanceExercise._04_NeedForSpeed;

public class SportCar extends Car {
    final static double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
