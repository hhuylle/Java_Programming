package day24_dayAndTime;

import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        // now() method
        LocalDate today = LocalDate.now(); // this object is immutable
        System.out.println(today);

        // of() method
        LocalDate birthday = LocalDate.of(1995,10,25);
        System.out.println(birthday);

        System.out.println("=========================================");

        // getYear() method: used to get value of year
        System.out.println(today.getYear());
        //output: 2023

        // getMonth() method: used to get string value of month
        System.out.println(today.getMonth());
        //output: APRIL

        // getMonthValue() method: used to get primitive value of month
        System.out.println(today.getMonthValue());
        //output: 4
        System.out.println("---------------------------------------------");

        // getDayOfWeek() method:
        System.out.println(today.getDayOfWeek());
        //output: MONDAY
        System.out.println(birthday.getDayOfWeek());
        //output: WEDNESDAY

        // getDayOfMonth() method:
        System.out.println(today.getDayOfMonth());
        //output: 3
        System.out.println(birthday.getDayOfMonth());
        //output: 25

        // getDayOfYear() method:
        System.out.println(today.getDayOfYear());
        //output: 93
        System.out.println(birthday.getDayOfYear());
        //output: 298

        System.out.println("===========================================");

        // plusYears() method:
        today = today.plusYears(1); // need to assign back today to update the value
        System.out.println(today);
        //output: 2024-04-03

        LocalDate graduationDate = LocalDate.of(2025,6,4);
        graduationDate = graduationDate.plusYears(2);
        System.out.println(graduationDate);
        //output: 2027-06-04

        System.out.println("---------------------------");

        // plusMonths() method:
        graduationDate = graduationDate.plusMonths(7);
        System.out.println(graduationDate);
        //output: 2028-01-04

        System.out.println("---------------------------");

        // plusWeeks() method:
        graduationDate = graduationDate.plusWeeks(7);
        System.out.println(graduationDate);
        //output: 2028-02-22

        System.out.println("---------------------------");

        // plusDays() method:
        graduationDate = graduationDate.plusDays(100);
        System.out.println(graduationDate);
        //output: 2028-06-01

        System.out.println("===========================================");

        // minusYear(), minusMonths(), minusDays() methods
        LocalDate yourBirthday = LocalDate.of(1991,6,21);
        LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3).minusDays(15);
        System.out.println(yourBrotherBirthday);
        //output: 1989-03-06

        System.out.println("===========================================");

        // isEqual() method:
        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1994,7,7);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1);
        //output: true

        System.out.println("===========================================");

        // isBefore(), isAfter() methods:
        LocalDate grad_date = LocalDate.of(2023,1,1);
        System.out.println(grad_date.isBefore(LocalDate.of(2022,12,31)));//output: false
        System.out.println(grad_date.isAfter(LocalDate.of(2022,12,31)));//output: true

        System.out.println("===========================================");

        // isLeapYear() method
        System.out.println(LocalDate.of(2023,4,3).isLeapYear());//output: false









    }
}