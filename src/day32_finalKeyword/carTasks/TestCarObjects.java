package day32_finalKeyword.carTasks;

public class TestCarObjects {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", "Blue", 2019, 25000);

        Honda honda = new Honda("CRV-EXL", "Black", 2020, 34000);

        Audi audi = new Audi("Q6", "Silver", 2021, 50000);

        BMW bmw = new BMW("X6", "Black", 2017, 45000);

        Tesla tesla = new Tesla("Model 3", "White", 2022, 65000);

        System.out.println(toyota);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(tesla);

        System.out.println("------------------------------------------------------");

        toyota.start();
        honda.start();
        audi.start();
        bmw.start();
        tesla.start();

        System.out.println("------------------------------------------------------");

        // tesla.setPrice(30000);
        // tesla.setModel("Model H");

        System.out.println(tesla);

    }
}
