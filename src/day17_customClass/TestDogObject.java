package day17_customClass;

public class TestDogObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 4;
        dog1.size = "Large";
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "Bella";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "White";

        Dog dog3 = new Dog();
        dog3.setInfo("Loki", "Bulldog", 'M', 3, "Medium", "Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Asau","German Shepherd",'M',9,"Large","Gray");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat(); // the action eat() method just only affects to dog3 object

        dog4.drink();


    }
}
