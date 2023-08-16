package day21_multiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"James","Daniel","Adam","Lucia"}; // 4 names
        String[] group2 = {"Alena","Dana","Alex"}; // 3 names
        String[] group3 = {"Eva","Emily","Jones","Ryan","Tara"}; // 5 names
        String[] group4 = {"Kelly","Kevin"}; // 2 names

        String[][] groups = {group1,group2,group3,group4};

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        //[James, Daniel, Adam, Lucia]
        //James
        //Daniel
        //Adam
        //Lucia
        //[Alena, Dana, Alex]
        //Alena
        //Dana
        //Alex
        //[Eva, Emily, Jones, Ryan, Tara]
        //Eva
        //Emily
        //Jones
        //Ryan
        //Tara
        //[Kelly, Kevin]
        //Kelly
        //Kevin
        System.out.println("---------------------------------------------");

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("----------------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }
        }
        //[Kelly, Kevin]
        //Kelly
        //Kevin
        //[Eva, Emily, Jones, Ryan, Tara]
        //Eva
        //Emily
        //Jones
        //Ryan
        //Tara
        //[Alena, Dana, Alex]
        //Alena
        //Dana
        //Alex
        //[James, Daniel, Adam, Lucia]
        //James
        //Daniel
        //Adam
        //Lucia
        System.out.println("---------------------------------------------");

        System.out.println(groups);

        System.out.println(Arrays.toString(groups));
        // toString()==>for single dimensional array ONLY
        System.out.println(Arrays.deepToString(groups));
        // deepToString()==>for multi-dimensional array ONLY
        //[[James, Daniel, Adam, Lucia], [Alena, Dana, Alex], [Eva, Emily, Jones, Ryan, Tara], [Kelly, Kevin]]





    }
}
