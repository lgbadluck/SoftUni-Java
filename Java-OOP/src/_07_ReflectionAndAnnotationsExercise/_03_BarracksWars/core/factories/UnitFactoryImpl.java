package _07_ReflectionAndAnnotationsExercise._03_BarracksWars.core.factories;

import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.interfaces.Unit;
import _07_ReflectionAndAnnotationsExercise._03_BarracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) {

		// Archer, Pikeman, Swordsman, Horseman, Gunner
		try {
			Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
			Constructor<Unit> constructor = unitClass.getDeclaredConstructor();// празен конструктор
			return constructor.newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException | InvocationTargetException |
				 NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}
}
