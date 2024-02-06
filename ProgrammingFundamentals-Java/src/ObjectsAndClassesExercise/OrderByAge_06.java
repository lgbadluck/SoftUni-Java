package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<PersonInfo> personInfoList = new ArrayList<>();
        String input = scanner.nextLine();

        while(!input.equals("End")) {
            String[] info = input.split(" ");
            PersonInfo personInfoToAdd = new PersonInfo(info[0], info[1], Integer.parseInt(info[2]));
            if(personInfoList.isEmpty()) {
                personInfoList.add(personInfoToAdd);
            } else {
                for (int i = 0; i < personInfoList.size(); i++) {
                    if(personInfoToAdd.getAge() < personInfoList.get(i).getAge()) {
                        personInfoList.add(i, personInfoToAdd);
                        break;
                    } else if (i==personInfoList.size()-1) {
                        personInfoList.add(personInfoToAdd);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (PersonInfo personInfo : personInfoList){
            System.out.printf("%s with ID: %s is %d years old.\n",
                    personInfo.getName(),
                    personInfo.getNumberID(),
                    personInfo.getAge()
                    );
        }

    }
    public static class PersonInfo {
        private String name;
        private String numberID;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumberID() {
            return numberID;
        }

        public void setNumberID(String numberID) {
            this.numberID = numberID;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public PersonInfo(String name, String numberID, int age) {
            this.name = name;
            this.numberID = numberID;
            this.age = age;
        }
    }
}
