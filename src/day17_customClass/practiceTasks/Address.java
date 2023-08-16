package day17_customClass.practiceTasks;

public class Address {
    /*
    Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
     */
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public int zipCode;

    public void setInfoOfAddress(int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address " +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                "\n" + buildingNumber +
                " " + street +
                "\n" + city +
                " " + state +
                ", " + zipCode;
    }
}
