package day15_whileLoop.practiceTasks;

import java.util.Scanner;

public class RoomReservation {
    /*
    Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants to reserve a room.
    	if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice day"
    			(if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)
	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$
            the program should be able to display the room he/she reserved and total price of the room.
            (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
     */

    public static void main(String[] args) {

        int priceOfRoom = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room? Yes/No");
        String answer = input.next().toLowerCase();









    }
}
