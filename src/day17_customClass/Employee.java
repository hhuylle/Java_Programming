package day17_customClass;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String id;
    public String jobTitle;
    public double salary;

    // setInfo method --> belongs to the Object
    public void setInfo(String name, int age, char gender, String id, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // sets all the attributes of the Employee object at once
    public String toString() { // to avoid getting hash-codes when we print the Employee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void work(){
        System.out.println(name+" is working");
    }
}
