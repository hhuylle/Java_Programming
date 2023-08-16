package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/y");

        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));
        //output: Wednesday, 04/05/2023

        LocalDate data1 = LocalDate.of(2022,7,1);

        System.out.println(data1.format(df));
        //output: Friday, 07/01/2022

        System.out.println("-----------------------------------------");

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17,30);

        System.out.println(time1.format(tf));
        //output: 05:30 PM

        System.out.println("-----------------------------------------");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));
        //output: Wednesday, Apr/05/2023  04:52 PM

        System.out.println("-----------------------------------------");

        //use the LocalDateTime get the date and time in the following format:
        //            Tuesday, 1:00 pm, Nov/24/2020





    }
}
