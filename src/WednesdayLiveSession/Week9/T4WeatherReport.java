package WednesdayLiveSession.Week9;

import Utilities.MathUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T4WeatherReport {
    /*
    T4WeatherReport [ArrayList, loop, operators]

    Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

        max temperature, min temperature, median (middle temperature), mean (average temperature)

        also, give a prediction temperature range for the next  few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

        we can assume the data will always be an odd number so there will be one median

    Ex:
        input:
            62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

            // excluded:  42.3, 43.0, 68.9, 77.3
            // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

        output:
            max: 62.1
            min: 44.8
            median: 53.4
            mean: 52.44
            predication: 47 - 57
     */
    public static void main(String[] args) {

        ArrayList<Double> temps = new ArrayList<>();
        temps.addAll(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));
        System.out.println("Original "+temps);
        //output: Original [62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5]
        Collections.sort(temps);
        System.out.println("Sorted "+temps);
        //output: Sorted [42.3, 43.0, 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1, 68.9, 77.3]
        temps.remove(0);//remove the lowest temp
        temps.remove(0);//remove the second-lowest temp
        temps.remove(temps.size()-1);//remove the highest temp
        temps.remove(temps.size()-1);//remove the second-highest temp
        System.out.println("Fixed data "+temps);
        //output: Fixed data [44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1]
        System.out.println("Max: " + Collections.max(temps));
        //output: Max: 62.1
        System.out.println("Min: " + Collections.min(temps));
        //output: Min: 44.8
        System.out.println("Median: " + temps.get(temps.size()/2));
        //output: Median: 53.4
        double average = 0;
        for (Double each : temps) {
            average += each;
        }

        average /= temps.size();
        System.out.println("Mean: " + MathUtility.format(average));

        // predication: 47 - 57
        System.out.println("Predication: " + ((int)average - 5) + " - " + ((int)average+5));


    }
}
