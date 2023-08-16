package day31_inheritance.shape_methodOverriding;

public class Triangle extends Shape{

    private double base, height, sideA, sideC;

    public Triangle(double base, double height, double sideA, double sideC) {
        setBase(base);
        setHeight(height);
        setSideA(sideA);
        setSideC(sideC);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double area() {
        return (base*height)/2;
    }

    @Override
    public double perimeter() {
        return base+sideA+sideC;
    }

    public void draw() {
        super.draw();
        System.out.println("\t\t\t ^" +
                "\n\t\t\t/ \\" +
                "\n\t\t   /   \\" +
                "\n\t\t  /     \\" +
                "\n\t\t /       \\" +
                "\n\t\t ---------");

    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                ", name='" + getName() + '\'' +
                ", base=" + base +
                ", height=" + height +
                ", sideA=" + sideA + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
