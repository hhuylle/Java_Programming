package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.util.Arrays;

public class Student extends Person{

    private char grade;
    private String studentId;

    public Student(String name, char gender, LocalDate DOB, char grade, String studentId) {
        super(name, gender, DOB);
        setGrade(grade);
        setStudentId(studentId);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        Character[] grades = {'A','B','C','D','F'};
        if (Arrays.asList(grades).contains(grade)){
            this.grade = grade;
        }else {
            System.err.println("Invalid grade: "+grade+"\nThe grade can only be "+Arrays.toString(grades));
            System.exit(1);
        }

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }
}
