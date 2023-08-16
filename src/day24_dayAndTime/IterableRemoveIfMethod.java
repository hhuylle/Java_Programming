package day24_dayAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class IterableRemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","C#","Java","Ruby","C++","C"));
        names.removeIf(each->each.startsWith("J"));
        System.out.println(names);

        System.out.println("==================================================");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));

        employees.get(0).setInfo("Josh",34,'M',"A01","Java Developer", 100000);
        employees.get(1).setInfo("Emily",40,'F',"A02","SDET", 90000);
        employees.get(2).setInfo("Conor",38,'M',"A03","Project Manager", 130000);
        employees.get(3).setInfo("Bella",29,'F',"A04","Java Developer", 95000);
        employees.get(4).setInfo("Jimmy",54,'M',"A05","Data Analyst", 105000);

        employees.removeIf(s->s.salary > 100000);

        for (Employee each : employees) {
            System.out.println(each.name+": "+each.salary);
        }



    }
}
