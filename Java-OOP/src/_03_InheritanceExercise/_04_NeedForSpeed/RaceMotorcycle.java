package _03_InheritanceExercise._04_NeedForSpeed;

public class RaceMotorcycle extends Motorcycle {
    final static double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
