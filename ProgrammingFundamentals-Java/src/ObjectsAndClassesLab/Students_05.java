package ObjectsAndClassesLab;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] studentFields = input.split(" ");

            String firstName = studentFields[0];
            String lastName = studentFields[1];
            int age = Integer.parseInt(studentFields[2]);
            String city = studentFields[3];

            Student currStudent = new Student(firstName, lastName, age, city);

            students.add(currStudent);
            input = scanner.nextLine();
        }

        String filterCity = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(),
                        student.getLastName(), student.getAge());
            }
        }
    }

    public static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;

        public Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
