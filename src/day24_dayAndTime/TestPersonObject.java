package day24_dayAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Jacky",'M', LocalDate.of(1960,9,15));
        people[2].setInfo("Emily",'F', LocalDate.of(1967,12,14));
        people[3].setInfo("Jenny",'F', LocalDate.of(1995,10,25));
        people[4].setInfo("Harry",'M', LocalDate.of(1991,6,21));


        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));

        // print name & birth of each person object
        for (Person each : studentsList) {
            System.out.println(each.name+" : "+ each.dateOfBirthday);
        }

        // remove all the person object that has the age > 55
        studentsList.removeIf(p -> p.age>55);
        System.out.println(studentsList);
    }
}
