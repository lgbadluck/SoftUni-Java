package _03_InheritanceExercise._06_Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if(gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return "Animal default sound...";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        stringBuilder.append(this.name).append(" ").append(this.age).append(" ").append(this.gender).append(System.lineSeparator());
        stringBuilder.append(this.produceSound());
        return stringBuilder.toString();
    }
}
