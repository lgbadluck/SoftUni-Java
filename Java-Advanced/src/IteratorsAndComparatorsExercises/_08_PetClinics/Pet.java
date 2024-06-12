package IteratorsAndComparatorsExercises._08_PetClinics;

public class Pet {
    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    private String name;
    private int age;
    private String kind;

    @Override
    public String toString() {
        return String.format("%s %d %s", getName(), age, kind);
    }
}
