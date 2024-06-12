package ExamPreparation.spaceCrafts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LaunchPad {
    String name;
    int capacity;
    List<Spacecraft> spacecrafts;

    public LaunchPad(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.spacecrafts = new ArrayList<>();
    }

    public void addSpacecraft(Spacecraft spacecraft) {
        if (this.spacecrafts.size() < this.capacity) {
            this.spacecrafts.add(spacecraft);
        }
    }

    public boolean removeSpacecraft(String name) {
        for (Spacecraft craft : this.spacecrafts) {
            if(craft.getName().equals(name)) {
                this.spacecrafts.remove(craft);
                return true;
            }
        }
        return false;
    }

    public String getHeaviestSpacecraft() {
        StringBuilder output = new StringBuilder();
        Optional<Spacecraft> heaviestSpacecraft = this.spacecrafts.stream()
                .max(Comparator.comparingInt(Spacecraft::getWeight));

        heaviestSpacecraft.ifPresent(spacecraft ->
                output
                        .append(spacecraft.getName())
                        .append(" - ")
                        .append(spacecraft.getWeight())
                        .append("kg.")
        );
        return output.toString().trim();
    }

    private Spacecraft getSpacecraft(String name) {
        for (Spacecraft craft : this.spacecrafts) {
            if(craft.getName().equals(name)) {
                return craft;
            }
        }

        return null;
    }

    public int getCount() {
        return this.spacecrafts.size();
    }

    public List<Spacecraft> getSpacecraftsByMissionType(String missionType) {
        List<Spacecraft> craftsByMissionType = new ArrayList<>();
        for (Spacecraft craft : this.spacecrafts) {
            if (craft.getMissionType().equals(missionType)) {
                craftsByMissionType.add(craft);
            }
        }

        if (craftsByMissionType.isEmpty()) {
            System.out.println("There are no spacecrafts to respond this criteria.");
        }
        return craftsByMissionType;
    }

    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        output.append("Spacecrafts launched from ").append(this.name).append(System.lineSeparator());
        if (this.spacecrafts.isEmpty()) {
            output.append("none");
        }
        else {
            int count = 1;
            for (Spacecraft craft : this.spacecrafts) {
                output.append(count++).append(". ").append(craft.name).append(System.lineSeparator());
            }
        }

        return output.toString().trim();
    }
}