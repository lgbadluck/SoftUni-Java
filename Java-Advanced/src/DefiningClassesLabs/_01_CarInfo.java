package DefiningClassesLabs;

public class _01_CarInfo {
    private String brand;
    private String model;
    private int horsePower;


    public String getInfo() {
        return String.format("The car is: %s %s - %d HP.", brand, model, horsePower).trim();
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
