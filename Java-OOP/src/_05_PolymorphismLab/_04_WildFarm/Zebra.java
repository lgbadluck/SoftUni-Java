package _05_PolymorphismLab._04_WildFarm;

import java.text.DecimalFormat;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
        }
        else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return animalType + "[" +
                animalName + ", " +
                df.format(animalWeight) + ", " +
                livingRegion + ", " +
                foodEaten +
                "]";
    }
}
