package day28_encapsulation.personTask;

public class Person {
    /*
    Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize name
			Add a constructor to initialize name and age
			Add a constructor to initialize name and language
			Add a constructor to initialize name and gender
			Add a constructor to initialize name, age and gender
			Add a constructor to initialize name, age, gender, language
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
     */
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name) { // allows to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) { // allows to create Person object just by setting the name & age of the person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) { // allows to create Person object just by setting the name & language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) { // allows to create Person object just by setting the name & gender of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) { // allows to create Person object just by setting the name, age, & gender of the person
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) { // allows to create Person object just by setting the name, age, gender, & language of the person
        this(name, age, gender);
        this.language = language;
    }

    static {
        planet = "The Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHead = 1;
    }

    public static void printPlanetName(){
        System.out.println("The planet name is: " + planet);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet=" + planet + '\'' +
                '}';
    }
}
