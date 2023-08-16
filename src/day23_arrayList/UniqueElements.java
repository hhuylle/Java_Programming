package day23_arrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Henry");// 0
        names.add("Kristine");// 1
        names.add("Kelly");// 2
        names.add("Kelly");// 3
        names.add("Henry");// 4
        names.add("Kelly");// 5
        names.add("Harry");
        names.add("Peter");
        names.add("Peter");

        for (String each : names) {
            if (names.indexOf(each) == names.lastIndexOf(each)){
                System.out.println(each);
                //break; use break; to return first unique element
            }
        }


    }
}
