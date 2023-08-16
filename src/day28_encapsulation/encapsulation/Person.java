package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {
    /*
    Variables:
    name, age, gender, dateOfBirth
        name:
            Write: can not be null/empty/blank
            Read: if name is not, return "Unknown" instead
        age:
            Write: age can not be less than zero or greater than 120
        gender:
            Write: gender can only be 'M' or 'F'
        dateOfBirth:
            Write:  can not be after today's date
    Add a constructor that can set all the fields
    Add toString()
     */
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {

        if (name.equalsIgnoreCase("not")){
            name =  "Unknown";
        }
        return name;
    }

    public void setName(String name) {

        if (name == null){
            System.err.println("Name can not be null: "+name);
            System.exit(1);
        }
        if (name.isBlank()){
            System.err.println("Name can not be blank: "+name);
            System.exit(1);
        }
        if (name.isEmpty()){
            System.err.println("Name can not be empty: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public void setAge(int age) {

        if (age < 0 || age> 120){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F'){
            this.gender = gender;

        }else {
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }

    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        if (dateOfBirth.isAfter(LocalDate.now())){
            System.err.println("Invalid birthday");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
