package day34_abstraction_interface.animalTask;

public class Shark extends Animal implements Swimmable, Wild{

    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Shark "+getName()+" eats fish");
    }

    @Override
    public void swim() {
        System.out.println("Shark "+getName()+" can swim");
    }

    @Override
    public void hunt() {
        System.out.println("Shark "+getName()+" can hunt");
    }
}
