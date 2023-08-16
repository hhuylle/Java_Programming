package day24_dayAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

        LocalTime startingTime = LocalTime.of(10,30);

        System.out.println(startingTime);
        //output: 10:30

        LocalTime currentTime = LocalTime.now();

        System.out.println(currentTime);
        //output: 12:32:20.673324 depend on computer's time
        System.out.println("==================================================");

        LocalTime time1 = LocalTime.of(23,59, 59);
        System.out.println(time1);
        //output: 23:59:59

        // plusHours() method:
        time1 = time1.plusHours(1);
        System.out.println(time1);
        //output: 00:59:59
        time1 = time1.plusMinutes(45);
        System.out.println(time1);


    }
}
