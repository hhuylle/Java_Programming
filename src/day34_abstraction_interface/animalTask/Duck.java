package day34_abstraction_interface.animalTask;

public class Duck extends Animal implements Flyable, Swimmable, Playable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" eats worm");
    }

    @Override
    public void fly() {
        System.out.println("Duck "+getName()+" can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck "+getName()+" can swim");
    }

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" can play");
    }
}
