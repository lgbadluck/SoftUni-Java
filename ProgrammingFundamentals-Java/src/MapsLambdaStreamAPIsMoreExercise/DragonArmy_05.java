package MapsLambdaStreamAPIsMoreExercise;

import java.util.*;

public class DragonArmy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<DragonStats>> dragonTypeMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n > 0) {
            String input = scanner.nextLine();
            String type = input.split(" ")[0];
            String name = input.split(" ")[1];
            String damage = input.split(" ")[2];
            String health = input.split(" ")[3];
            String armor = input.split(" ")[4];

            DragonStats dragonToAdd = new DragonStats(name, damage, health, armor);

            dragonTypeMap.putIfAbsent(type, new ArrayList<>());
            if (dragonTypeMap.get(type).contains(dragonToAdd)) {
                int idx = dragonTypeMap.get(type).indexOf(dragonToAdd);
                dragonTypeMap.get(type).set(idx,dragonToAdd);
            } else dragonTypeMap.get(type).add(dragonToAdd);

            n--;
        }

        for (Map.Entry<String, List<DragonStats>> entry : dragonTypeMap.entrySet()) {
            String typeToPrint = entry.getKey();
            double avgDamage = 0.0;
            double avgHealth = 0.0;
            double avgArmor = 0.0;
            double size = entry.getValue().size();
            for (DragonStats dragon : entry.getValue()) {
                avgDamage += dragon.getDamage();
                avgHealth += dragon.getHealth();
                avgArmor += dragon.getArmor();
            }
            avgDamage = avgDamage / size;
            avgHealth = avgHealth / size;
            avgArmor = avgArmor / size;

            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", typeToPrint, avgDamage, avgHealth, avgArmor);
            entry.getValue().stream().sorted(Comparator.comparing(DragonStats::getName)).forEach(dragon -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",
                    dragon.getName(), dragon.getDamage(), dragon.getHealth(), dragon.getArmor()));

        }
    }

    static class DragonStats {
        String name;
        int damage;
        int health;
        int armor;


        public int getDamage() {
            return damage;
        }

        public int getHealth() {
            return health;
        }

        public int getArmor() {
            return armor;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DragonStats that = (DragonStats) o;
            return Objects.equals(getName(), that.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName());
        }

        public DragonStats(String name, String damage, String health, String armor) {
            this.name = name;
            if (damage.equals("null")) {
                this.damage = 45;
            } else {
                this.damage = Integer.parseInt(damage);
            }
            if (health.equals("null")) {
                this.health = 250;
            } else {
                this.health = Integer.parseInt(health);
            }
            if (armor.equals("null")) {
                this.armor = 10;
            } else {
                this.armor = Integer.parseInt(armor);
            }
        }

    }
}
