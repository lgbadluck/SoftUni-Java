package _05_PolymorphismLab._04_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Feline {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
//        if (food instanceof Meat) {
            foodEaten += food.quantity;
//        }
//        else {
//            System.out.println("Cats are not eating that type of food!");
//        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return animalType + "[" +
                animalName + ", " +
                breed + ", " +
                df.format(animalWeight) + ", " +
                livingRegion + ", " +
                foodEaten +
                "]";
    }
}
