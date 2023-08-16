package WednesdayLiveSession.week10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class T1Reservation {
    /*
    T1Reservation [LocalDateTime, Scanner, conditional]

    Create a program that will help create a reservation for our restaurant.
    Ask the user to enter what year, month, and day they want to create the reservation
    Then ask what hour they want to create it for (iassume the minutes are 0)

    Use the given information to create a LocalDateTime object and verify if the reservation can be made or not

    Here are the restrictions:
        - We are accepting reservations for only 2023
        ask for the year first and if it is not a valid year do not check anything else and print: Sorry we cannot make a reservation for the year $year

        - Any date before the current day(when the program is run) is invalid and should print:
        Sorry this date has already passed

        - Here is some days where reservations are booked: if the day selected is one of these print Sorry this date is all booked
            November 23
            December 24

        - check the time for the reservation, we have times open from 2 pm - 8 pm on weekends (FRI, SAT, SUN)
            if all the checks were met print: Book for $date
            if the other checks were met but the time given is not within the defined range print: Sorry we close at 11 on weekends
            otherwise, print: Sorry we only have availability on weekends
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, would you like to make reservation at our Java restaurant\nPlease enter the year: ");
        int year = input.nextInt();

        System.out.println("Please enter the month: ");
        int month = input.nextInt();

        System.out.println("Please enter the day: ");
        int day = input.nextInt();

        System.out.println("Please enter the time(24h format)");
        int hour = input.nextInt();

        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, 0);
        //dateTime.format(DateTimeFormatter.ofPattern("MM-dd-y @HH-mm a"));


        if (dateTime.getYear() != 2023){
            System.err.println("Sorry we cannot make a reservation for the year: "+year);
            System.exit(0);
        }

        if (dateTime.isBefore(LocalDateTime.now())){
            System.err.println("Sorry this date has already passed: "+day);
            System.exit(0);
        }

        if ((dateTime.getMonthValue() == 11 && dateTime.getDayOfMonth()==23) || (dateTime.getMonthValue() == 12 && dateTime.getDayOfMonth()== 24) ){
            System.err.println("Sorry this date is all booked on that days");
            System.exit(0);
        }

        boolean validTime = dateTime.getHour()>14 && dateTime.getHour()<=20;
        int dayInWeek = dateTime.getDayOfWeek().getValue();
        boolean onWeekend = dayInWeek==5 || dayInWeek==6 || dayInWeek==7;//dayInWeek >=5

        if (validTime && onWeekend){
            System.out.println("Booked for "+ dateTime.format(DateTimeFormatter.ofPattern("MM-dd-y @hh-mm a")));
        }else {
            if (!validTime){
                System.err.println("Sorry we only have time from 2pm to 8pm");
            }

            if (!onWeekend){
                System.err.println("Sorry we only have availability on weekends");
            }
        }


    }
}
