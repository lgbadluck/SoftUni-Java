package _03_InheritanceExercise._04_NeedForSpeed;

public class FamilyCar extends Car {
    //final static double DEFAULT_FUEL_CONSUMPTION = 3;

    public FamilyCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }
}
