package _03_InheritanceExercise._04_NeedForSpeed;

public class Car extends Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
