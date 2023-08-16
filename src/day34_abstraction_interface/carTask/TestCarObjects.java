package day34_abstraction_interface.carTask;

public class TestCarObjects {

    public static void main(String[] args) {

        // CANNOT create Car object from abstract class

        Honda honda = new Honda("Pilot","Black",2022,45000);

        Audi audi = new Audi("Q7","Silver",2020,60000);

        Tesla tesla = new Tesla("Model Y","White",2023,150000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println();

        honda.start();
        audi.start();
        tesla.start();

        System.out.println();

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println();

        audi.autoPark();
        tesla.autoPilot();
    }
}
