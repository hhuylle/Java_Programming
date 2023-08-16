package day33_abstraction.employeeTask;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        //Employee employee = new Employee(...); we cannot create object from an abstract class. Object MUST be created from concrete class(child/sub class)

        Teacher teacher = new Teacher("James",45,'M',"B1","Math Teacher",75000);

        Developer developer = new Developer("Anna",32,'F',"C1","Java Developer",95000,"Java");

        Tester tester = new Tester("Kelly",31,'M',"D1","Manual Tester",80000);

        Driver driver = new Driver("Peter",30,'M',"E1","Uber Delivery",65000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(driver);

        System.out.println();

        teacher.work();
        developer.work();
        tester.work();
        driver.work();

    }
}
