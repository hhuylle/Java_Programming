package day34_abstraction_interface.animalTask;

public class Dog extends Animal implements Playable, Swimmable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dog "+getName()+" eats dog food");
    }

    @Override
    public void play() {
        System.out.println("Dog "+getName()+" can play");
    }

    @Override
    public void swim() {
        System.out.println("Dog "+getName()+" can swim");
    }
}
