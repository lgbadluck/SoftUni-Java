package _01_WorkingWithAbstractionExercise._03_CardWithPower;


public class Card {

    // силата на картата = силата на боята + силата на ранка
    private int power;

    public Card(int power) {
        this.power = power;
    }

    public int getPower() {
        return this.power;
    }
}
