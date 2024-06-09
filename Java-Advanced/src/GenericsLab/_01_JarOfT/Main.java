package GenericsLab._01_JarOfT;

public class Main {
    public static void main(String[] args) {

    Jar<String> jarOfPickles = new Jar<>();

    jarOfPickles.add("Pickle1");
    jarOfPickles.add("Pickle2");

    String name = jarOfPickles.remove();

        System.out.println(name);
    }
}
