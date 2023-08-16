package day31_inheritance.animal_methodOverriding;

public class Eagle extends Animal{

    //private boolean hasWings;

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat() {
        System.out.println("Eagle "+getName()+" is eating snake");
    }

    public void fly(){
        System.out.println("Eagle "+getName()+" is flying on the sky");
    }
}
