package Sunday_Review.week15;

import java.util.*;

public class SetTypes {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("zebra");
        set1.add("Java");
        set1.add("8");
        set1.add("!hello");
        set1.add(null);
        set1.add("Java");
        set1.add("!hi");
        System.out.println(set1);
        // [zebra, null, Java, !hi, 8, !hello]

        System.out.println();

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("zebra");
        set2.add("Java");
        set2.add("8");
        set2.add("!hello");
        set2.add(null);
        set2.add("Java");
        set2.add("!hi");
        System.out.println(set2);
        // [zebra, Java, 8, !hello, null, !hi]

        System.out.println();

        Set<String> set3 = new TreeSet<>();
        set3.add("zebra");
        set3.add("Java");
        set3.add("8");
        set3.add("!hello");
       // set3.add(null); // null not allow in TreeSet
        set3.add("Java");
        set3.add("!hi");
        System.out.println(set3);
        // [!hello, !hi, 8, Java, zebra]

        System.out.println("-------------------------------------------");
        // Mini task: remove duplicate characters from the String
        String str = "AAABBBBBCCCDDDEEEFF";

        System.out.println(new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replace(","," ").replace("[","").replace("]","")); // convert the String to an array, the array in converted to a List and that is the argument of the LinkedHashSet constructor

        // Loop
        Set<String> tabs = new HashSet<>();
        tabs.add("INUN01");
        tabs.add("UBNUWB1");
        tabs.add("NIEJ3");
        // you are on tab INUN01 and you need to switch to UBNUWB1, how do you do it?
        for(String each: tabs){
            if (each.equals("UBNUWB1")){
                // switch  to that tab
            }
        }





    }
}
