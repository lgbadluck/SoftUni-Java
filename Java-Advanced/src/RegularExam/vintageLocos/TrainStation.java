package RegularExam.vintageLocos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class TrainStation {
    private String name;
    private int capacity;
    private int railGauge;
    private List<Locomotive> locomotives;

    public TrainStation(String name, int capacity, int railGauge) {
        this.name = name;
        this.capacity = capacity;
        this.railGauge = railGauge;
        this.locomotives = new ArrayList<>();
    }

    public void addLocomotive(Locomotive locomotive) {
        if(capacity>locomotives.size()) {
            if (railGauge != locomotive.getGauge()) {
                System.out.printf("The rail gauge of this station does not match the locomotive gauge! " +
                        "Difference: %d mm.\n", Math.abs(this.railGauge- locomotive.getGauge()) );
            }
            else {
                locomotives.add(locomotive);
            }
        }
    }

    public boolean removeLocomotive(String name) {
        return locomotives.removeIf(s -> s.getName().equals(name));
    }

    public String getFastestLocomotive() {
        Locomotive fastestLoco = locomotives.stream().max(Comparator.comparingInt(Locomotive::getMaxSpeed))
                .orElse(null);;
        return fastestLoco != null
                ? String.format("%s is the fastest locomotive with a maximum speed of %d km/h.", fastestLoco.getName(), fastestLoco.getMaxSpeed())
                : "There are no locomotives.";
    }

    public String getOldestLocomotive() {
        if (locomotives == null || locomotives.isEmpty()) {
            return "There are no locomotives.";
        }
        Locomotive oldestLocomotive = locomotives.getFirst();

        for (Locomotive locomotive : locomotives) {
            if (locomotive.getBuildDate().isBefore(oldestLocomotive.getBuildDate())) {
                oldestLocomotive = locomotive;
            }
        }
        return oldestLocomotive.getName();
    }

    public Locomotive getLocomotive(String name) {
        return locomotives.stream()
                .filter(s -> s.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public int getCount() {
        return locomotives.size();
    }


    public String getStatistics() {
        int count = 1;
        StringBuilder locosStats = new StringBuilder();
        for (Locomotive locomotive : locomotives) {
            locosStats.append(String.valueOf(count++)).append(". ").append(locomotive.getName()).append(System.lineSeparator());
        }
        return !locomotives.isEmpty()
                ? String.format("Locomotives departed from %s:%n", name) + locosStats
                : String.format("There are no locomotives departing from %s station.", name);

    }
}
