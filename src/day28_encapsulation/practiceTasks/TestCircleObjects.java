package day28_encapsulation.practiceTasks;

public class TestCircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        circle1.setRadius(-1);
        System.out.println(circle1);

        Circle circle2 = new Circle(4.5);
        circle2.setRadius(1.5);
        System.out.println(circle2);


    }
}
