package day31_inheritance.practiceTasks.studentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, String studentId, String fieldfOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldfOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(getName()+" has to study again");
    }
}
