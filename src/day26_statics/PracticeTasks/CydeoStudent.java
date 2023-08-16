package day26_statics.PracticeTasks;

public class CydeoStudent {
    /*
    Create a class named CydeoStudent:
				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord
				Add a constructor that can set All the fields (instances)
				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProLanguage(): displays the name of programming language
					toString()
     */
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public int batchNumber, groupNumber;
    public static String schoolName = "Cydeo School",
                         magicWord = "Java";

    public CydeoStudent(String name, int age, char gender, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public void attendClass(){
        System.out.println(name+ " is attending a class");
    }

    public static void printSchoolName(){
        System.out.println("School name: "+ schoolName);
    }

    public static void printProgLanguage(){
        System.out.println("Programming language: "+ magicWord);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
