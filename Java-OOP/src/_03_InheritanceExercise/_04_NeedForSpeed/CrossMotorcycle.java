package _03_InheritanceExercise._04_NeedForSpeed;

public class CrossMotorcycle extends Motorcycle {
    //final static double DEFAULT_FUEL_CONSUMPTION = 8;

    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
