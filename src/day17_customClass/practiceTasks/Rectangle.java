package day17_customClass.practiceTasks;

public class Rectangle {
    /*
    create a custom class named Rectangle
		Attributes:
		    length, width

		Actions:
		    setInfo(): sets the length and width of the rectangle object
		    calculateArea(): calculates the area of the rectangle, returns it as double
		    calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
		    toString(): when a rectangle object is passed in print statement
		    		it should display the length, width, area and perimeter of the Rectangle object
     */

    public double length;
    public double width;

    public void setInfoOfRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length*width;
    }

    public double calculateOfPerimeter() {
        return 2 * (this.length + this.width);
    }

    public String toString() {
        return "Rectangle{" +
                " Length = " + length +
                ", Width = " + width +
                ", The Area of the Rectangle = " + calculateArea() +
                ", The Perimeter of the Rectangle = " + calculateOfPerimeter() +
                '}';
    }


}
