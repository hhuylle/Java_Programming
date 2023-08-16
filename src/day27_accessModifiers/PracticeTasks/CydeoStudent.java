package day27_accessModifiers.PracticeTasks;

public class CydeoStudent {
    /*
    create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
     */
    public String name;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage, secretCode;

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo School";
        programmingLanguage = "Java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("The school name is: "+schoolName);
    }

    public static void printSecretCode(){
        System.out.println("The secret code is: "+secretCode);
    }

    public void attendClass(){
        System.out.println(name+" is attending a class");
    }

    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }
}
