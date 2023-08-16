package day31_inheritance.practiceTasks.employeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, String id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is driving");
    }
}
