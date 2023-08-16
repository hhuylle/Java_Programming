package day34_abstraction_interface.animalTask;

public class Tiger extends Animal implements Wild{

    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+getName()+" eats buffalo");
    }

    @Override
    public void hunt() {
        System.out.println("Tiger "+getName()+" can hunt");
    }
}
