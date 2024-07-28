package _07_ReflectionAndAnnotationsExercise._03_BarracksWars.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
