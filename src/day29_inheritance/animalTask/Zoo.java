package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',5,"Large","White");

        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray",'F',3,"Medium","Black");

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',10,"Large","Black");

        System.out.println(dog);
        //Dog{name='Max', breed='Husky', gender=M, age=5, size='Large', color='White'}
        System.out.println(cat);
        //Cat{name='Felicia', breed='Stray', gender=F, age=3, size='Medium', color='Black'}
        System.out.println(tiger);
        //Tiger{name='Sher Khan', breed='Bengal', gender=M, age=10, size='Large', color='Black'}

        System.out.println("----------------------------------------------------------------------------");

        dog.eat();// calling methods from Dog class
        dog.sleep();
        dog.drink();

        cat.eat();// calling methods from Cat class
        cat.sleep();
        cat.drink();

        tiger.eat();// calling methods from Tiger class
        tiger.drink();
        tiger.sleep();

        System.out.println("----------------------------------------------------------------------------");

        dog.bark();
        //cat.bark();

        cat.meow();
        //tiger.meow();
        cat.scratch();

        tiger.hunt();
        //cat.hunt();

        System.out.println("----------------------------------------------------------------------------");
        /*
        System.out.println(dog.name);
        System.out.println(dog.color);

        dog.gender = 'K';
        dog.age = -10;
        */

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);

    }
}
