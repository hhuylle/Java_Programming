package Sunday_Review.week15;

import Sunday_Review.week10.Person;

import java.util.*;

public class MapType {

    public static void main(String[] args) {

        // key - apt number, value - person lives there
        Map<Integer, Person> residents = new LinkedHashMap<>();
        residents.put(1, new Person("Erik", 21));
        residents.put(2, new Person("Kelly", 30));
        residents.put(3, new Person("Helen",25));
        residents.put(2, new Person("Jane",31)); // keys are unique, so the value is updated

        System.out.println(residents); // {1=Erik 21, 2=Jane 31, 3=Helen 25}

        for (int key : residents.keySet()){ // keySet returns a Set of keys
            System.out.println("In Apartment "+key+" "+residents.get(key).name+" lives there");
        }

        System.out.println("----------------------------------------------------");

        // key: String - Continent, value: List of String - Countries
        Map<String, List<String>> continent = new HashMap<>();
        continent.put("North America", new ArrayList<>(Arrays.asList("US", "Canada","Mexico")));
        continent.put("Europe", new ArrayList<>(Arrays.asList("England", "France","Poland","Italy","Spain","Monaco","Kosovo")));
        continent.put("Asia", new ArrayList<>(Arrays.asList("Japan", "Taiwan","South Korea", "India")));

        for (Map.Entry<String, List<String>> each : continent.entrySet()){
            System.out.println("Continent: "+each.getKey());
            System.out.println("\tCountries: "+each.getValue());
        }

        // Mini task: Print the first and last letter of each country

        for (List<String> each : continent.values()){ // the values are List<String>
            for (String eachCountry : each){ // iterating through the List<String>
                System.out.println(eachCountry.substring(0,1)+eachCountry.substring(eachCountry.length()-1));
            }
        }

        continent.get("Europe").add("UK"); // get the List of Europe and adds the UK element into that List
        System.out.println(continent);





    }
}
