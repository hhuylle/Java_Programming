package day28_encapsulation.personTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Anna");

        Person person2 = new Person("Ben", 'M');

        Person person3 = new Person("Carson", 30);

        Person person4 = new Person("Daniel","English");

        Person person5 = new Person("Jenny",27,'F');

        Person person6 = new Person("Harry", 31, 'M',"Vietnamese");

        //person6.planet = "Mars"; we can not call static variable through the object person6

        //Person.planet = "Mars"; we can call static variable through the class Person

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);

        person4.name = "Kelly";
        System.out.println(person4);


        Person.printPlanetName();

        person1.eat("Pho");

        person2.drink("Tea");

        person5.drink("Starbucks");

        person6.drink("Coffee");



    }
}
