package day09_scanner.practice_tasks;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        int speedLimit = 55;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the current speed: ");
        int currentSpeed = input.nextInt();

        input.close();


        if (currentSpeed>speedLimit){
            System.out.println("You are driving " + currentSpeed +" mph over the limit. Slow down !" );
        }


    }
}
