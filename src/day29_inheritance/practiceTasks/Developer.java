package day29_inheritance.practiceTasks;

import java.util.ArrayList;

public class Developer {
    /*
    Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be negative
					3. age MUST be between 18 and 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement
     */
    private String name;
    private char gender;
    private int age;
    private String id, jobTitle;
    private double salary;
    private String progLanguage;

    public void setInfo(String name, char gender, int age, String id, String jobTitle, double salary, String progLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgLanguage(progLanguage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender=='M' || gender=='F'){
            this.gender = gender;
        }else {
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }
        if (age>=18 && age<=65){
            this.age = age;
        }else {
            System.err.println("Invalid age:"+age);
            System.exit(1);
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Salary can not be negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        boolean validLanguage = (progLanguage == "Java") || (progLanguage=="JavaScript") || (progLanguage=="Python") || (progLanguage=="Ruby") || (progLanguage=="C#") || (progLanguage=="C++") || (progLanguage=="Swift");
        if (validLanguage){
            this.progLanguage = progLanguage;
        }else {
            System.err.println("Invalid programming language: "+progLanguage);
            System.exit(1);
        }

    }

    public void coding(){
        System.out.println(name+" is coding with "+progLanguage);
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", progLanguage='" + progLanguage + '\'' +
                '}';
    }
}
