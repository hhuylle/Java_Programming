package day28_encapsulation.encapsulation;

public class Test {

    public static void main(String[] args) {

        Student student = new Student();

        // student.age = -200;
        student.setAge(30);

        //System.out.println(student.age);
        System.out.println(student.getAge());

        //student.name = "Anna";
        student.setName("");

        System.out.println(student.getName());



    }
}
