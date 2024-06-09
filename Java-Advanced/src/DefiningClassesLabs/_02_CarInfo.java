package DefiningClassesLabs;

public class _02_CarInfo {
    private String brand;
    private String model;
    private int horsePower;

    public _02_CarInfo(String brand) {
        this(brand, "unknown", -1);
    }

    public _02_CarInfo(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.", brand, model, horsePower).trim();
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
