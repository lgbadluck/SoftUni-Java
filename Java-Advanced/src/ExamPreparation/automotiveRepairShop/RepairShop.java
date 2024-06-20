package ExamPreparation.automotiveRepairShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.size()<capacity) {
            vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String vin) {
        return vehicles.removeIf(s -> s.getVIN().equals(vin));
    }

    public int getCount() {
        return vehicles.size();
    }

    public Vehicle getLowestMileage() {
        return Collections.min(vehicles, Comparator.comparing(Vehicle::getMileage));
    }

    public String report() {
        String vehiclesData =
                vehicles.stream()
                .map(Vehicle::toString)
                .collect(Collectors.joining(System.lineSeparator()));
        return String.format("Vehicles in the preparatory:%n") + vehiclesData;
    }
}
