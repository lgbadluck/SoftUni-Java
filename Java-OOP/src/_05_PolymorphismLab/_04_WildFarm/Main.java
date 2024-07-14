package _05_PolymorphismLab._04_WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] animalParts = input.split("\\s+");
            String animalType = animalParts[0];
            String animalName = animalParts[1];
            Double animalWeight = Double.parseDouble(animalParts[2]);
            String animalLivingRegion = animalParts[3];
            String catBreed = "";
            Animal animal = null;

            switch (animalType) {
                case "Mouse":
                    animal = new Mouse(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Tiger":
                    animal = new Tiger(animalName, animalType, animalWeight, animalLivingRegion);
                    break;
                case "Cat":
                    if (animalParts.length == 5) {
                        catBreed = animalParts[4];
                    }
                    animal = new Cat(animalName, animalType, animalWeight, animalLivingRegion, catBreed);
                    break;
            }

            String[] foodParts = scanner.nextLine().split("\\s+");
            String foodType = foodParts[0];
            Integer foodQnt = Integer.parseInt(foodParts[1]);
            Food food = null;

            switch (foodType) {
                case "Vegetable":
                    food = new Vegetable(foodQnt);
                    break;
                case "Meat":
                    food = new Meat(foodQnt);
                    break;
            }

            if (animal != null) {
                animal.makeSound();
                animal.eat(food);
                System.out.println(animal);
            }

            input = scanner.nextLine();
        }
    }
}
