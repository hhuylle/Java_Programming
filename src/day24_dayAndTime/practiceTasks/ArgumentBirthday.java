package day24_dayAndTime.practiceTasks;

import java.time.LocalDate;

public class ArgumentBirthday {
    /*
    Create a function that accepts an int argument birthYear, return true if the person was born on leap year, otherwise return false
     */
    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1991,6,21);

        System.out.println(birthDay.isLeapYear());




    }
}
