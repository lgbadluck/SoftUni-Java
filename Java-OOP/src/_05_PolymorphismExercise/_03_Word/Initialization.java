package _05_PolymorphismExercise._03_Word;

public class Initialization {

    public static CommandInterface buildCommandInterface(StringBuilder text) {
        return new CommandImpl(text);
    }
}
