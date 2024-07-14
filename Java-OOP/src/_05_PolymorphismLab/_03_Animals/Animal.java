package _05_PolymorphismLab._03_Animals;

public abstract class Animal {
    String name;
    String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public abstract String explainSelf();
}
