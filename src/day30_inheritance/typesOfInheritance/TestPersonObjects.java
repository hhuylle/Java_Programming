package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Anna",'F', LocalDate.of(1995,10,25),'A',"A01");

        President president = new President("Biden",'M',LocalDate.of(1942,10,20),LocalDate.of(2021,1,20));

        Teacher teacher = new Teacher("Saim",'M',LocalDate.of(1985,11,1),"B01","Java Instructor",95000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        president.lie();
        teacher.teach();

        System.out.println("--------------------------------------------");

        student.eat("Banhmi");
        teacher.eat("Pho");
        president.eat("Shit");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Shit");



    }
}
