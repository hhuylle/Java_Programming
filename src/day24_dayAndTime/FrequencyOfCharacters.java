package day24_dayAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbbbcccc";

        //                output: a3b4c5
        String result = "";
        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")),each);

            if (!result.contains(each)){
                result+=each+frequency;
            }
        }
        System.out.println(result);


    }
}
