package day34_abstraction_interface.carTask;

public abstract class Car { // meant to be inherited, cannot be instantiated

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // to set the class name to the make of the Car
        this.model = model;
        setColor(color);
        if(year<1886){
            System.err.println("Year can not be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price can not be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){ // to make sure that non-sub classes outside the package cannot access it
        System.out.println("Press the brake "+ make +" "+model);
    }

    protected abstract void start(); // meant to be overridden

    public String toString() {
        return make + "{" +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }
}

/*
1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Press the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot()
 */