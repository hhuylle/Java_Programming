package day17_customClass;

public class TestEmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Jenny",28,'F',"A123","Software Developer",95_000);

        Employee employee2 = new Employee();
        employee2.setInfo("Harry",31,'M',"B123","SDET",150_000);

        Employee employee3 = new Employee();
        employee3.setInfo("Samuel",25,'M',"C123","Full-Stack Developer",120000);

        employee3.name = "Kelly"; // can change the value from the Employee Object
        employee3.gender = 'F'; // can change the value from the Employee Object


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee2.work();

    }
}
