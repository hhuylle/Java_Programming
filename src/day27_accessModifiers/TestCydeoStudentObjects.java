package day27_accessModifiers;

public class TestCydeoStudentObjects {

    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1 = new CydeoStudent("Anna",30,'F');
        CydeoStudent student2 = new CydeoStudent("Ryan",25,'M');
        CydeoStudent student3 = new CydeoStudent("Bella",32,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);



    }
}
