package groomingSalon;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Initialize the repository
        GroomingSalon salon = new GroomingSalon(2);
        System.out.println(salon.getCount()); // 0

        // Initialize entity
        Pet dog = new Pet("Ellias", 5, "Tim");

        // Print Pet
        System.out.println(dog); // Ellias 5 - (Tim)
        System.out.println(dog.toString()); // Ellias 5 - (Tim)
        salon.add(dog);
        System.out.println(salon.getCount()); // 1
        salon.add(dog);
        System.out.println(salon.getCount()); // 2
        salon.add(dog);
        System.out.println(salon.getCount()); // ?
        System.out.println(salon.getStatistics());
        // Add Pet
        salon.add(dog);
        System.out.println(salon.getCount()); // ?
        // Get Pet
        Pet pet = salon.getPet("Ellias", "Tim");
        System.out.println(pet); // Bella 2 - (Mia)
        Pet pet1 = salon.getPet("Bella", "Mia");
        System.out.println(pet1); // Bella 2 - (Mia)
        Pet pet2 = salon.getPet("Ellias", "Tim");
        System.out.println(pet2); // Bella 2 - (Mia)


        // Remove Pet
        System.out.println(salon.remove("Ellias")); // true
        System.out.println(salon.getCount()); // 1
        System.out.println(salon.remove("Pufa")); // false
        System.out.println(salon.getCount()); // 1
        System.out.println(salon.remove("123")); // false
        System.out.println(salon.getCount()); // 1
        System.out.println(salon.remove("456")); // false
        System.out.println(salon.getCount()); // 1
        System.out.println(salon.remove("qwe")); // false
        System.out.println(salon.getCount()); // 1
        System.out.println(salon.remove("Ellias")); // true
        System.out.println(salon.getCount()); // 0

        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");

        salon.add(cat);
        System.out.println(salon.getCount()); // 0
        salon.add(bunny);
        System.out.println(salon.getCount()); // 0

        // Get Pet
        Pet pet3 = salon.getPet("Bella", "Mia");
        System.out.println(pet3); // Bella 2 - (Mia)

        // Count
        System.out.println(salon.getCount()); // 2

        // Get Statistics
        System.out.println(salon.getStatistics());
        // The grooming salon has the following clients:
        //Bella Mia
        //Zak Jon

    }
}
