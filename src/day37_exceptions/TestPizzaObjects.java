package day37_exceptions;

import day36_polymorphism_referenceTypeCastings.Circle;

public class TestPizzaObjects {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);
        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1 == pizza2); // output: false
        System.out.println(pizza1.equals(pizza2)); // output: true
        System.out.println();

        Object obj = new Pizza('S',2,3);
       // obj.calcCost();

        boolean r = obj.equals(pizza2);
        System.out.println(r);
        System.out.println();

        double total = ((Pizza) obj).calcCost();
        System.out.println(total);
        System.out.println();

       // double area = ((Circle)obj).area();
       // System.out.println(area);
        try{
            double area = ((Circle)obj).area();
        }catch (ClassCastException e){
            e.printStackTrace();
        }

        System.out.println("Test Completed");

    }
}
