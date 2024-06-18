package ExamPreparation.fishingPond;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Pond {
    private int capacity;
    private List<Fish> fishes;

    public Pond(int capacity) {
        this.capacity = capacity;
        this.fishes = new ArrayList<>();
    }


    public void addFish(Fish fish) {
        if (fishes.size() == capacity) {
            //System.out.println("This basin is at full capacity!");
        } else {
            fishes.add(fish);
        }
    }

    public boolean removeFish(String kind) {
        return fishes.removeIf(s -> s.getSpecies().equals(kind));
    }


    public Fish getOldestFish() {
        return fishes.stream().max(Comparator.comparingInt(Fish::getAge))
                .orElse(null);
    }

    public Fish getFish(String species) {
        return fishes.stream()
                .filter(s -> s.getSpecies().equals(species))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return fishes.size();
    }

    public int getVacancies() {
        return capacity - fishes.size();
    }

    public String report() {
        String sharksData = fishes.stream()
                .map(Fish::toString)
                .collect(Collectors.joining(System.lineSeparator()));
        return String.format("Fishes in the pond:%n") + sharksData;
    }
}
