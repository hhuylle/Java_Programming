package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObjects {

    public static void main(String[] args) {

        CydeoDevStudent student1 = new CydeoDevStudent("Daniel",'M', LocalDate.of(1989,11,1),"A1","zero to hero",2);
        System.out.println(student1);
        System.out.println();
        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();
    }
}
