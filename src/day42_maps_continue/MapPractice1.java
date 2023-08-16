package day42_maps_continue;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("------------------------------------------------");

        // How many female & male employees in the map?
        int countMaleEmployees = 0;
        int countFemaleEmployees = 0;
/*
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if (gender.equals("M")){
                countMaleEmployees++;
            }else {
                countFemaleEmployees++;
            }
        }
        System.out.println(countMaleEmployees);
        System.out.println(countFemaleEmployees);

 */

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("M")){
                countMaleEmployees++;
            }else {
                countFemaleEmployees++;
            }
        }

        System.out.println("countMaleEmployees = " + countMaleEmployees);
        System.out.println("countFemaleEmployees = " + countFemaleEmployees);

        System.out.println("------------------------------------------------");

        // display the names of all the female employees
/*
        for (String eachKey : employeeMap.keySet()) {
            String gender = employeeMap.get(eachKey);
            if (gender.equals("F")){
                System.out.println(eachKey);
            }
        }

 */
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }
        }

        System.out.println("------------------------------------------------");

        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("M")){
                eachEntry.setValue("Male");
            }else{
                eachEntry.setValue("Female");
            }
        }

        System.out.println(employeeMap);




    }
}
