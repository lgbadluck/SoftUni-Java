package ObjectsAndClassesExercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Students_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new LinkedList<>();

        while (n>0) {
            String[] input = scanner.nextLine().split("\\s");
            //System.out.println(Arrays.stream(input).toList());
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student studentToAdd = new Student(firstName, lastName, grade);
            if(studentList.isEmpty()) {
                studentList.add(studentToAdd);
            } else {
                for (int i = 0; i < studentList.size(); i++) {
                    if(studentToAdd.getGrade() >= studentList.get(i).getGrade()) {
                        studentList.add(i, studentToAdd);
                        break;
                    } else if (i==studentList.size()-1) {
                        studentList.add(studentToAdd);
                        break;
                    }
                }
            }
            n--;
        }
        for(Student student : studentList) {
            System.out.printf("%s %s: %.2f\n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
    public static class Student {
        String firstName;
        String lastName;
        double grade;

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
        public double getGrade() {
            return grade;
        }
        public void setGrade(double grade) {
            this.grade = grade;
        }

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
    }
}
