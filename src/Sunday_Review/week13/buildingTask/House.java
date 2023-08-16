package Sunday_Review.week13.buildingTask;

public class House extends Building implements HasBackYard{

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("Mowing the backyard");
    }

    @Override
    public String toString() {
        return location+" , costs $ "+price+", number of residents "+numberOfResidents+" | ";
    }
}
/*
Create an class House
		child class of Building
		implements HasBackyard

		create instance variable
			int number of residents

		create a constructor to assign the location, price, and number of residents

		implement all abstract methods (give some print statements. Ex: Paying for House, or Going into Backyard)

		override the toString to print the location, price, and number of residents
 */
