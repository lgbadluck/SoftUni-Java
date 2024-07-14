package _05_PolymorphismLab._04_WildFarm;

public abstract class Mammal extends Animal {
    String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }
}
