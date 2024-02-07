package ObjectsAndClassesMoreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompanyRoster_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Department> departmentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0) {
            String[] input = scanner.nextLine().split(" ");
            /*
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            String email;
            if(input.length>=5) email = input[4];
            int    age;
            if(input.length>=6) age   = Integer.parseInt(input[5]);
            */
            Employees newEmployee = new Employees(input);

            String departName = input[3];

            Department newDepartment = new Department(departName);
            boolean deptExists = false;
            if (departmentList.isEmpty()) {
                departmentList.add(newDepartment);
                departmentList.get(departmentList.size() - 1).addEmployee(newEmployee);
            } else {
                for (int i = 0; i < departmentList.size(); i++) {
                    if (departmentList.get(i).getDeptName().equals(departName)) {
                        departmentList.get(i).addEmployee(newEmployee);
                        deptExists = true;
                        break;
                    }
                }
                if (!deptExists) {
                    departmentList.add(newDepartment);
                    departmentList.get(departmentList.size() - 1).addEmployee(newEmployee);
                }
            }

            n--;
        }
        double topAvgSalary = 0.0;
        int topIdxForDepartmentHiSalary = 0;
        for (int i = 0; i < departmentList.size(); i++) {
            double sum = departmentList.get(i).getAvgSalary();
            if (sum > topAvgSalary) {
                topAvgSalary = sum;
                topIdxForDepartmentHiSalary = i;
            }
        }
        System.out.print("Highest Average Salary: ");
        departmentList.get(topIdxForDepartmentHiSalary).printAllEmployees();
    }

    public static class Department {

        List<Employees> employeesList = new ArrayList<>();
        String          deptName;
        double          totalSalaries = 0;
        int             employeeCount = 0;

        public String getDeptName() {
            return deptName;
        }

        public Department(String deptName) {
            this.deptName = deptName;
        }

        public void addEmployee(Employees newEmployee) {
            if (employeesList.isEmpty()) {
                this.employeesList.add(newEmployee);
                this.employeeCount++;
            } else {
                for (int i = 0; i < employeesList.size(); i++) {
                    if (newEmployee.getSalary() > this.employeesList.get(i).getSalary()) {
                        this.employeesList.add(i, newEmployee);
                        this.employeeCount++;
                        return;
                    }
                }
                this.employeesList.add(newEmployee);
                this.employeeCount++;
            }
        }

        public void calcTotalSalaries() {
            for (Employees employee : employeesList) {
                this.totalSalaries += employee.getSalary();
            }
        }

        public double getAvgSalary() {
            double avgSalary = 0.0;
            this.calcTotalSalaries();
            if (this.employeeCount != 0) avgSalary = this.totalSalaries / this.employeeCount;
            else avgSalary = -1.0;
            return avgSalary;
        }

        public void printAllEmployees() {
            System.out.println(this.deptName);
            //System.out.println(this.employeeCount);
            for (Employees employee : this.employeesList) {
                System.out.println(employee);
            }
        }
    }

    public static class Employees {
        String name;
        double salary;
        String position;
        String department;
        String email = "n/a";
        int    age   = -1;

        public double getSalary() {
            return salary;
        }

        public Employees(String[] input) {
            this.name = input[0];
            this.salary = Double.parseDouble(input[1]);
            this.position = input[2];
            this.department = input[3];
            if (input.length >= 5) {
                if(input[4].contains("@")) this.email = input[4];
                else this.age = Integer.parseInt(input[4]);
            }
            if (input.length >= 6) this.age = Integer.parseInt(input[5]);
        }

        public Employees(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public Employees(String name, double salary, String position, String department, String email) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
        }

        public Employees(String name, double salary, String position, String department) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
        }

        @Override
        public String toString() {
            return name +
                    " " + String.format("%.2f", salary) +
                    " " + email +
                    " " + age;
        }


    }
}
