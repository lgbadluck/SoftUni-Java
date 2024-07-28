package _07_ReflectionAndAnnotationsLab._02_GettersAnSetters;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Class classReflection = Reflection.class;

        Method[] methodsInClassReflection = classReflection.getDeclaredMethods();

//        StringBuilder settersSB = new StringBuilder();
//        StringBuilder gettersSB = new StringBuilder();

        List<Method> methodList = new ArrayList<>(Arrays.asList(methodsInClassReflection));
        methodList.sort(Comparator.comparing(Method::getName));

        for (Method methodGet : methodList) {
            if (methodGet.getName().contains("get")) {
                if(methodGet.getReturnType().toString().contains("int")) {
                    System.out.println(methodGet.getName() + " will return class " + methodGet.getReturnType());
                } else
                    System.out.println(methodGet.getName() + " will return " + methodGet.getReturnType());
            }
        }
        for (Method methodSet : methodList) {
            if (methodSet.getName().contains("set")) {
                    System.out.println(methodSet.getName() + " and will set field of class " + methodSet.getParameterTypes()[0].getName());
            }
        }

//        for (int i = 0; i < methodsInClassReflection.length; i++) {
//            if(methodsInClassReflection[i].getName().contains("get")){
//                gettersSB.append(methodsInClassReflection[i].getName())
//                        .append(" will return class ")
//                        .append(methodsInClassReflection[i].getReturnType())
//                        .append(System.lineSeparator());
//            }
//            else if (methodsInClassReflection[i].getName().contains("set")){
//                settersSB.append(methodsInClassReflection[i].getName())
//                        .append(" and will set field of class ")
//                        .append(methodsInClassReflection[i].getParameterTypes()[0].getName())
//                        .append(System.lineSeparator());
//            }
//        }
//        System.out.println(gettersSB.toString().trim());
//        System.out.println(settersSB.toString().trim());
    }
}