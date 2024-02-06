package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    private int capacity;
    List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public boolean add(Pet pet) {
        if (this.capacity > 0) {
            this.data.add(pet);
            this.capacity--;
            return true;
        } else return false;
    }

    public boolean remove(String name) {
        if (!this.data.isEmpty()) {
            for (int i = 0; i <= this.data.size(); i++) {
                if (this.data.get(i).getName().equals(name)) {
                    this.data.remove(i);
                    this.capacity++;
                    return true;
                }
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        Pet result = null;
        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                result = pet;
            }
        }
        return result;
    }

    public int getCount() {
        int result = 0;
        for (Pet pet : this.data) {
            result++;
        }
        return result;
    }

    public String getStatistics() {
        String result = "The grooming salon has the following clients:\n";

        for (Pet pet : this.data) {
            result += pet.getName() + " " + pet.getOwner() + "\n";
        }

        return result;
    }


}
