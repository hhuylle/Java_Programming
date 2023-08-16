package day35_polymorphism;

import day31_inheritance.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction_interface.animalTask.*;
import day34_abstraction_interface.carTask.Audi;
import day34_abstraction_interface.carTask.Car;
import day34_abstraction_interface.carTask.Honda;
import day34_abstraction_interface.carTask.Tesla;

import java.util.ArrayList;
import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max","Husky",'M',4,"Medium","White");

        Cat cat = new Cat("Max","Husky",'M',4,"Medium","White");

        Tiger tiger = new Tiger("Samba","Asian Tiger",'M',9,"Large","Black Brown");

        Lion lion = new Lion("Samba","African Lion",'M',6,"Large","Brown Yellow");

        Eagle eagle = new Eagle("Bald Eagle","American Eagle",'F',5,"Large","White and Black");

        Parrot parrot = new Parrot("Anna","Bird",'F',3,"Small","Green and Yellow");

        Dolphin dolphin = new Dolphin("Ben","Assassin",'M',7,"Large","Gray");

        Shark shark = new Shark("Bella","White Shark",'F',10,"Large","White");

        Duck duck = new Duck("Bill","Vietnamese Duck",'M',2,"Small","White");

        Animal[] animals = {dog, cat, tiger, lion, eagle, parrot, dolphin, shark, duck};

        Animal animal = new Dog("Max","Husky",'M',4,"Medium","White");
        animal.eat();
        animal.drink();
        animal.sleep();

        //animal.play();
        //animals.bark();

        System.out.println("--------------------------------------------");

        String str = "Java";

        Integer n = 100;

        Boolean r = false;

        Double d = 10.5;

        Circle circle = new Circle(4);

        Honda honda = new Honda("Pilot","Black",2022,45000);

        Audi audi = new Audi("Q7","Silver",2020,60000);

        Tesla tesla = new Tesla("Model Y","White",2023,150000);

        Teacher teacher = new Teacher("James",45,'M',"B1","Math Teacher",75000);

        Developer developer = new Developer("Anna",32,'F',"C1","Java Developer",95000,"Java");

        Tester tester = new Tester("Kelly",31,'M',"D1","Manual Tester",80000);

        Driver driver = new Driver("Peter",30,'M',"E1","Uber Delivery",65000);

        Object[] object = {str, n, r, d, circle, honda, audi, tesla, teacher, developer, tester, driver};

        System.out.println(Arrays.toString(object));

        Object[] employees = {teacher, developer, tester,driver};

        Employee obj = new Driver("Peter",30,'M',"E1","Uber Delivery",65000);
        obj.work();

        System.out.println("-----------------------------------------------------");








    }
}
