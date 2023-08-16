package Week11.virginia;

public class TestHouse {
    // same package, but different class

    public static void main(String[] args) {

        House obj = new House();
        obj.address = "1000 N Lane";
        obj.price = 100_000;
        obj.neighborhoodName = " Barry Hills";
        //obj.ownerName = "James Bond"; // private is ONLY accessible in the class



    }
}
