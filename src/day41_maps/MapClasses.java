package day41_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>(); // random order, accepts null key
        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
       // hashMap.put("Daniel", 80000); // not duplicate, just update the value
        hashMap.put("Aaron", 78000);
        hashMap.put("Chris",null);
        hashMap.put("Brenda", null);
        hashMap.put(null, 120000);
        hashMap.put(null, 110000);
        hashMap.put(null, 100000);

        System.out.println("HashMap = "+hashMap);
        // HashMap = {Aaron=78000, null=100000, Emily=100000, Brenda=null, Chris=null, Daniel=95000, Bella=85000}

        System.out.println("----------------------------------------------------------------");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); // insertion order, accepts null key
        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Aaron", 78000);
        linkedHashMap.put("Chris",null);
        linkedHashMap.put("Brenda", null);
        linkedHashMap.put(null, 120000);
        linkedHashMap.put(null, 110000);
        linkedHashMap.put(null, 100000);

        System.out.println("LinkedHashMap = "+linkedHashMap);
        // LinkedHashMap = {Daniel=95000, Emily=100000, Bella=85000, Aaron=78000, Chris=null, Brenda=null, null=100000}

        System.out.println("----------------------------------------------------------------");

        Map<String, Integer> treeMap = new TreeMap<>(); // sorted order, doesn't accept null key but accepts null values
        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Aaron", 78000);
        treeMap.put("Chris",null); // value can be null in TreeMap
        treeMap.put("Brenda", null); // value can be null in TreeMap
       // treeMap.put(null, 120000); // key can not be null in TreeMap
       // treeMap.put(null, 110000); // key can not be null in TreeMap
       // treeMap.put(null, 100000); // key can not be null in TreeMap

        System.out.println("TreeMap = "+treeMap);
        // TreeMap = {Aaron=78000, Bella=85000, Brenda=null, Chris=null, Daniel=95000, Emily=100000}

        System.out.println("----------------------------------------------------------------");

        Map<String, Integer> hashtable = new Hashtable<>(); // random order, doesn't accept null key & values, synchronized
        hashtable.put("Daniel", 95000);
        hashtable.put("Emily", 100000);
        hashtable.put("Bella", 85000);
        hashtable.put("Aaron", 78000);
       // hashtable.put("Chris",null); // value in Hashtable can not be null
       // hashtable.put("Brenda", null); // value in Hashtable can not be null
        // hashtable.put(null, 120000); // key in Hashtable can not be null
        // hashtable.put(null, 110000); // key in Hashtable can not be null

        try {
            hashtable.put(null, 100000);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Hashtable = "+hashtable);
        // Hashtable = {Daniel=95000, Emily=100000, Aaron=78000, Bella=85000}



    }
}
/*
pair: name & salary
Daniel = 95000
Emily = 100000
Bella = 85000
 */
