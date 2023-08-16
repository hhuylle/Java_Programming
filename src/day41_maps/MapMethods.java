package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> students = new TreeMap<>();
        students.put("A01","Josh");
        students.put("B02","Nora");
        students.put("C03","Anna");
        students.put("D04","Kelly");
        students.put("E05","Brenda");
        students.put("E06","Brenda");
        students.put("B06","Brenda");
        students.put("E07","Brenda");
        students.put("E08","Brenda");

        System.out.println( students.size() ); // 8
        System.out.println(students);
        // {A01=Josh, B02=Nora, B06=Brenda, C03=Anna, D04=Kelly, E05=Brenda, E06=Brenda, E07=Brenda, E08=Brenda}

        System.out.println(students.get("E06")); // Brenda

        students.put("E05","Lucy");
        students.put("E07", "Mariana");
        System.out.println(students);
        // {A01=Josh, B02=Nora, B06=Brenda, C03=Anna, D04=Kelly, E05=Lucy, E06=Brenda, E07=Mariana, E08=Brenda}

        System.out.println(students.get("B02")); // Nora

        students.replace("A01", "Philip");
        students.replace("E08","Oriana");
        System.out.println(students);
        // {A01=Philip, B02=Nora, B06=Brenda, C03=Anna, D04=Kelly, E05=Lucy, E06=Brenda, E07=Mariana, E08=Oriana}

        students.remove("B06");
        System.out.println(students);
        // {A01=Philip, B02=Nora, C03=Anna, D04=Kelly, E05=Lucy, E06=Brenda, E07=Mariana, E08=Oriana}

        System.out.println(students.containsKey("B02")); // true
        System.out.println(students.containsKey("H09")); // false

        System.out.println(students.containsValue("Lucy")); // true
        System.out.println(students.containsValue("Muhtar")); // false

        System.out.println(students.isEmpty()); // false
        System.out.println(students.equals(students)); // true

        students.clear(); // clear() to remove all pairs
        System.out.println(students);

    }
}
/*
pair: id - name
 */
