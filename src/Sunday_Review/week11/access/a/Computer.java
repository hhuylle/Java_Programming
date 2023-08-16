package Sunday_Review.week11.access.a;

public class Computer {
    /*
    Computer [Inheritance, access modifiers]
	Follow the steps to practice using the concepts and see how they work in the code

	Create a package access.a
	Create a class Computer in package access.a
		define the instance variables with access modifiers:
			os - public
			memory - protected
			brand - default
			has wifi card - private

		create a toString
     */
    public String os;
    protected int memory;
    String brand; // when no access modifier is given it will be default access
    private boolean hasWifi;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }
}
