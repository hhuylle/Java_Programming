package day25_constructor;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dayOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    public Person(String name, int age, char gender, LocalDate dayOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dayOfBirth=" + dayOfBirth +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eat(String food){

    }

    public void sleeping(){
        System.out.println(name+" is sleeping");
    }

}

/*
name
age
gender
dateOfBirth
isMarried
isEmployed

add a constructor that can set all the field once an object is created

toString()

eat(String food)
sleeping()
drink(String drink)

 */