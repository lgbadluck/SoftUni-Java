package _05_PolymorphismLab._04_WildFarm;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
        }
        else {
            System.out.println("Mice are not eating that type of food!");
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
