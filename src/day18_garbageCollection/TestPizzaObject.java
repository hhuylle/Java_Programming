package day18_garbageCollection;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza();
        pizza1.setInfo('L',2,10);

        Pizza pizza2 = new Pizza();

        pizza2.setInfo('S',1,2);


        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("--------------------------------------------------");
        double totalCost = 0;
        for (int i = 0; i < 20; i++) {
            Pizza small = new Pizza();
            small.setInfo('S',2,2);
            totalCost += small.calcCost();

            Pizza medium = new Pizza();
            medium.setInfo('M',3,4);
            totalCost += medium.calcCost();

            Pizza large = new Pizza();
            large.setInfo('L',4,5);
            totalCost += large.calcCost();


        }

        System.out.println("Total = $" + totalCost);


    }
}
