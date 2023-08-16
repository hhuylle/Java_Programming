package day26_statics.PracticeTasks;

public class Circle {
    /*
     Create a class named Circle:
				Attributes:
					instance: radius, diameter
					static: pi
				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter
				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
     */
    public double radius, diameter;
    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    public double calArea(){
        double areaOfCircle = radius*radius*pi;
        return areaOfCircle;
    }

    public double calPerimeter(){
        double perimeterOfCircle = pi*diameter;
        return perimeterOfCircle;
    }

    public static void printPi(){
        System.out.println("Pi = "+pi);
    }

    public String toString() {
        return "Circle: " + "radius=" + radius + ", diameter=" + diameter + ", Pi = " + pi + ", Area of the circle = "+ calArea() + ", Perimeter of the circle = "+ calPerimeter();
    }
}
