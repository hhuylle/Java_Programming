package day36_polymorphism_referenceTypeCastings;

public class Square {

    private double size;

    public Square(double size) {
        this.size = size;
    }

    public double calcArea(){
        return size*size;
    }

    public double calcPerimeter(){
        return size*4;
    }

    @Override
    public boolean equals(Object obj) { // Equal method

        if (!(obj instanceof Square)){
            System.err.println("Invalid object! \nObject must be Square");
            System.exit(1);
        }

        if (size == ((Square) obj).size){
            return true;
        }

        return false;

    }
}
