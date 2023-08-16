package day34_abstraction_interface.animalTask;

public class Dolphin extends Animal implements Playable, Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Dolphin "+getName()+" eats fish");
    }


    @Override
    public void play() {
        System.out.println("Dolphin "+getName()+" can play");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin "+getName()+" can swim");
    }
}
