package day24_dayAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethods {

    public static void main(String[] args) {

        // replaceAll() method:
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));
        System.out.println(names);
        /*
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals("Java")){
                words.set(i, "PyThon");
            }
        }
        System.out.println(words);
        */
        Collections.replaceAll(names,"Java","Python");
        System.out.println(names);

        System.out.println("=====================================================");

        // frequency() method:
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,50,50,50,50,60,60,50,50,50));

        int count = Collections.frequency(list,50);

        System.out.println(count);

        System.out.println("=====================================================");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));

        int countJava = Collections.frequency(words,"Java");

        System.out.println(countJava);

        System.out.println("=====================================================");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,60,50,50,50));

        for (Integer each : numbers){
            if (Collections.frequency(numbers,each)==1){
                System.out.println(each);
            }
        }
    }

}
