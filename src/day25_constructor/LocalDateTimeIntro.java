package day25_constructor;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {

    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts);
        //output: 2023-04-05T10:46:19.702286500


        LocalDateTime ends = LocalDateTime.of(2023,5,18,23,0);

        System.out.println(ends);
        //output: 2023-05-18T23:00

        System.out.println(starts.getDayOfWeek());
        //output: WEDNESDAY

        System.out.println(starts.getHour());
        //output: 10
    }
}
