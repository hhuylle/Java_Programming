package day31_inheritance.practiceTasks.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int age, char gender, String id, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, salary, companyName);
        setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is coding in "+programmingLanguage);
    }
}
