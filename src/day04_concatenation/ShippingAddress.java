package day04_concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Aaron Kissinger",
                buildingNumber = "13621A",
                streetName = "Legacy Circle",
                city = "Fairfax,",
                state = "VA";
        int zipCode = 22030;

        System.out.println("Your Shipping address is:\n\t" + name + "\n\t" + buildingNumber + " " + streetName + "\n\t" + city + " " + state + " " + zipCode);

    }
}
