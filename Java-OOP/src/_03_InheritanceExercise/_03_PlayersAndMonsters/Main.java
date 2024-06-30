package _03_InheritanceExercise._03_PlayersAndMonsters;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();

        heroList.add(new Hero("username-Hero", 1));
        heroList.add(new Elf("username-Elf", 2));
        heroList.add(new MuseElf("username-MuseElf", 3));
        heroList.add(new Wizard("username-Wizard", 4));
        heroList.add(new DarkWizard("username-DarkWizard", 5));
        heroList.add(new SoulMaster("username-SoulMaster", 6));
        heroList.add(new Knight("username-Knight", 7));
        heroList.add(new DarkKnight("username-DarkKnight", 8));
        heroList.add(new BladeKnight("username-BladeKnight", 9));

        heroList.stream().forEach(System.out::println);
    }
}
