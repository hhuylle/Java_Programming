package day31_inheritance.practiceTasks.studentTask;

public class Student extends Person{

    private String studentId, fieldfOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, String studentId, String fieldfOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldfOfStudy(fieldfOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFieldfOfStudy() {
        return fieldfOfStudy;
    }

    public void setFieldfOfStudy(String fieldfOfStudy) {
        if (fieldfOfStudy==null || fieldfOfStudy.isEmpty()){
            System.err.println("Invalid field of study");
            System.exit(1);
        }
        this.fieldfOfStudy = fieldfOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade=='A' || grade=='B' || grade=='C' || grade=='D' || grade=='F'){
            this.grade = grade;
        }else {
            System.err.println("Invalid grade");
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName()+" is studying");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", student ID='" + studentId + '\'' +
                ", field of study='" + fieldfOfStudy + '\'' +
                ", grade='" + grade + '\'' +
                ", school name='" + schoolName + '\'' +
                '}';
    }
}
