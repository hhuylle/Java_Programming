package day26_statics.studentTask;

public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Ford");
        System.out.println(car1);

        Car car2 = new Car("Honda","CRV");
        System.out.println(car2);

        Car car3 = new Car("Toyota","Camry",2024);
        System.out.println(car3);

        Car car4 = new Car("Tesla","Y",2022,150000);
        System.out.println(car4);

        Car car5 = new Car("Kia","Niro",2023,50000,"Silver");
        System.out.println(car5);

    }
}
