package day28_encapsulation.encapsulation;

public class TestEmployeeObjects {

    public static void main(String[] args) {
        /*
        Employee employee1 = new Employee();

        employee1.setSalary(100000);

        System.out.println(employee1.getSalary());

        //employee1.setName("");

        System.out.println(employee1.getName());
        */

        Employee employee1 = new Employee("Jenny",25,"Java Developer",95000);

        System.out.println(employee1);



    }
}
