package day29_inheritance;

public class TestStudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Anna",25,'F','A',"Cydeo");
        System.out.println(student1);

        student1.setSchoolName("Harvard");
        student1.setGrade('B');
        System.out.println(student1);



    }
}
