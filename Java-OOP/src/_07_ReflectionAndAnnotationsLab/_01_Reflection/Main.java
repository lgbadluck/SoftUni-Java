package _07_ReflectionAndAnnotationsLab._01_Reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection = Reflection.class;
        System.out.println("class " + reflection.getSimpleName());

        Class superClass = reflection.getSuperclass();
        System.out.println(superClass);

        Class[] interfaces = reflection.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        // Object ref = reflection.newInstance(); // Deprecate since Java 9
        Object reflectionObject;
        reflectionObject = reflection.getDeclaredConstructor().newInstance();
        System.out.println(reflectionObject);
    }
}
