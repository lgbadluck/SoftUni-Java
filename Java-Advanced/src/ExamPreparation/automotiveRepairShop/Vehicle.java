package ExamPreparation.automotiveRepairShop;

public class Vehicle {
    private String VIN;
    private int mileage;
    private String damage;

    public Vehicle(String VIN, int mileage, String damage) {
        this.VIN = VIN;
        this.mileage = mileage;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return String.format("Damage: %s, Vehicle: %s (%d km)", damage, VIN, mileage);
    }

    public String getVIN() {
        return VIN;
    }

    public int getMileage() {
        return mileage;
    }
}
