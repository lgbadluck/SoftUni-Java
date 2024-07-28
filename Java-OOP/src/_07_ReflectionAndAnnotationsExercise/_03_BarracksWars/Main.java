package _07_ReflectionAndAnnotationsExercise._03_BarracksWars;

import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.interfaces.Repository;
import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.interfaces.Runnable;
import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.interfaces.UnitFactory;
import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.core.Engine;
import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.core.factories.UnitFactoryImpl;
import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.data.UnitRepository;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
