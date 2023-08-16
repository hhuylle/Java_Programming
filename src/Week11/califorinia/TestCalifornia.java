package Week11.califorinia;

import Week11.virginia.House;

public class TestCalifornia {

    // different package, different class
    public static void main(String[] args) {

        House obj = new House();
        obj.address = "1000 N Lane";
//      obj.price = 100_000;
//      obj.neighborhoodName = " Barry Hills";
//      obj.ownerName = "James Bond";
        // Only public is accessible in a different package

    }
}
