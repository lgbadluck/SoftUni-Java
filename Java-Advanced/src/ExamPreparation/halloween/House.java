package ExamPreparation.halloween;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class House {
    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addKid(Kid firstKid) {
        if(capacity>data.size()) {
            data.add(firstKid);
        }
    }

    public boolean removeKid(String kidName) {
        return data.removeIf(s -> s.getName().equals(kidName));
    }

    public Kid getKid(String streetName) {
        return data.stream()
                .filter(s -> s.getStreet().equals(streetName))
                .findFirst()
                .orElse(null);
    }

    public int getAllKids() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder dataStats = new StringBuilder();
        for (Kid kid : data) {
            dataStats.append(kid.getName()).append(" from ").append(kid.getStreet()).append(" street").append(System.lineSeparator());
        }
        return String.format("Children who visited a house for candy:%n") + dataStats;
    }
}
