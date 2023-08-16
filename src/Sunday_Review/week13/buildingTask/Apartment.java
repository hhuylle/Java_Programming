package Sunday_Review.week13.buildingTask;

public class Apartment extends Building implements HasBalcony{

    int monthsOfLease;

    public Apartment(String location, double price, int monthsOfLease) {
        super(location, price);
        this.monthsOfLease = monthsOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying the lease");
    }

    @Override
    public void openBalcony() {
        System.out.println("Going to balcony");
    }

    @Override
    public String toString() {
        return location+" , costs $ "+price+" months of lease "+monthsOfLease;
    }
}
/*
Create a class Apartment
		child class of Building
		implements HasBalcony

		create instance variable
			int months of lease

		create a constructor to assign the location, price, and months of lease

		implement all abstract methods (give some print statements)

		override the toString to print the location, price, and months of lease
 */
