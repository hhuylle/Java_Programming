package Sunday_Review.week10.booksTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBExample {

    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("ADDRESS", "007 M16 Lane");

        System.out.println(person1.get("FIRST_NAME")); // James

        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME","Perry", "LAST_NAME", "Rose", "ADDRESS","Kale Lane")); // to make a map quickly, same logic as person1 Map

        System.out.println(allPeople); // Map of String, String
        // [{ADDRESS=007 M16 Lane, LAST_NAME=Bond, FIRST_NAME=James}, {FIRST_NAME=Perry, LAST_NAME=Bond, ADDRESS=Kale Lane}]

        // Mini task: Last name of everyone
        for (Map<String, String> each : allPeople){
            System.out.println(each.get("LAST_NAME"));
        }

    }
}
/*
FIRST_NAME
LAST_NAME
ADDRESS
 */
