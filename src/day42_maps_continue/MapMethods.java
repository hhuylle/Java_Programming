package day42_maps_continue;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> students = new TreeMap<>();
        students.put("C02","Josh");
        students.put("B03","Nora");
        students.put("A02","Anna");
        students.put("D02","Kelly");
        students.put("A03","Brenda");

        Map<String, String> employees = new TreeMap<>();
        employees.putAll(students);

        System.out.println(employees);

        System.out.println(students == employees); // false

        System.out.println(students.equals(employees)); // true


    }
}
