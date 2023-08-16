package day36_polymorphism_referenceTypeCastings;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings {

    public static void main(String[] args) {

        Dog dog = new Dog();

       // Cat cat = new Dog();

        Animal animal = (Animal) new Dog(); // Parent is referencing to Child // this is Upcasting implicitly

        System.out.println("--------------------------------------");

        Animal animal1 = new Dog(); // Upcasting --> Polymorphism
        animal1.setInfo("Max","Husky",'M',5,"Large","White");
        animal1.eat();
        animal1.drink();
        animal1.sleep();

        ((Dog)animal1).bark(); // Downcasting

       // Dog dog1 = (Dog) animal1; // Downcasting

       // ((Cat)animal1).scratch(); // Dog can not be converted to the Cat, because there is not "IS A" relationship between Dog & Cat

        System.out.println("--------------------------------------");

        Phone phone = new Nokia("XR20","Small",350,"Blue");

        phone.call(911);
        phone.text(123456);
        ((Nokia) phone).selfDefense();

       // ((IPhone)phone).faceTime(123456); // Nokia can not be converted to Iphone, because there is no "IS A" relationship between Iphone & Nokia

        System.out.println("--------------------------------------");

        Employee employee = new Developer("Anna",32,'F',"C1","Java Developer",95000,"Java");
        employee.work();
        System.out.println(((Developer) employee).getProgrammingLanguage());

       // Driver driver = (Driver) employee;

        System.out.println("--------------------------------------");

        Electric electric = new Tesla("Model Y", "Blue",2020,60000);

        electric.charge();
        ((Tesla) electric).selfDrive();
        ((AutoPilot)electric).selfDrive();

        System.out.println("--------------------------------------");

        Employee employee1 = new Teacher("James",45,'M',"B1","Math Teacher",75000);

        Employee employee2 = new Developer("Anna",32,'F',"C1","Java Developer",95000,"Java");

        Employee employee3 = new Tester("Kelly",31,'M',"D1","Manual Tester",80000);

        Employee employee4 = new Driver("Peter",30,'M',"E1","Uber Delivery",65000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();



    }

}
