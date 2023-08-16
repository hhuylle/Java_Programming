package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee e1 = new Employee("Anna",32,'F',"Java Developer",95000, LocalDate.of(2023,2,2));

        Employee e2 = new Employee("Ben",30,'M',"Project Menager",120000,LocalDate.of(2022,9,25));


        System.out.println(e1);
        System.out.println(e2);

    }
}
