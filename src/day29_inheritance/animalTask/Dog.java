package day29_inheritance.animalTask;

public class Dog extends Animal { // Dog is Animal

    // Dog Class is child class/subclass
    /*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
    }
    */
    public void bark(){
        System.out.println(getName()+" is barking");
    }


}
