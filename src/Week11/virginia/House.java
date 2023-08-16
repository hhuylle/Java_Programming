package Week11.virginia;

import java.util.Arrays;

public class House {

    // main class
    public String address;
    protected double price;
    String neighborhoodName;
    private String ownerName;

    public static void main(String[] args) {

        House obj = new House();
        obj.address = "1000 N Lane";
        obj.price = 100_000;
        obj.neighborhoodName = " Barry Hills";
        obj.ownerName = "James Bond";

    }
}
 /*
    House [access modifiers, packages]

    Create a package virginia
    Create a class House
    define these instance variables with specific access modifiers:
        public - address
        protected - price
        default - neighborhood name
        private - owner name

    Create a class in the same package - virginia and test which access modifiers are accessible from the objects

    Create a different package california
    Create a class in the different package california and test which access modifiers are accessible from the objects
     */
