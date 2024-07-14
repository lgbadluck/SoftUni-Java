package _05_PolymorphismLab._04_WildFarm;

import java.text.DecimalFormat;

public class Tiger extends Feline {
    String livingRegion;

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.livingRegion = super.livingRegion;
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            foodEaten += food.quantity;
        }
        else {
            System.out.println("Tigers are not eating that type of food!");
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
