package day31_inheritance.vehicleTask;

public class Vehicle {
    /*
    Warmup Tasks:
	1. Create a class named Vehicle
			Variables:
				brand, model, year, color, price

			Encapsulate all the fields

			Add a constructor that can set all the fields

			Methods:
				toString()
	*/
    private String brand, model;
    private int year;
    private String color;
    private double price;

    public Vehicle(String brand, String model, int year, String color, double price) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    /*

	2. Create a child class of Vehicle named Car

			Extra methods:
				drive()

	3. Create a child class of Vehicle named Bike

			Extra methods:
				ride()

	4. Create a child class of Vehicle named Boat

			Extra methods:
				sail()

	5. Create a child class of Vehicle named AirPlane

			Extra methods:
				fly()
     */

}
