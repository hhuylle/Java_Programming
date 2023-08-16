package day31_inheritance.practiceTasks.studentTask;

public class GraduateStudent extends Student{

    public GraduateStudent(String name, int age, char gender, String studentId, String fieldfOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldfOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }
}
