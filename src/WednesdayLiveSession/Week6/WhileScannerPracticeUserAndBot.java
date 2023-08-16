package WednesdayLiveSession.Week6;

import java.util.Scanner;

public class WhileScannerPracticeUserAndBot {
    /*
    Bot [while, Scanner, conditional]

	create a program that will make a simple bot that can talk with the user. when the program runs the user will be able to continue typing to the bot. Based on what the user says the bot will say something back. Use the following sample set up, but be creative and add more to the bot

	user says | >bot responds

	hello | > world
	what is your age | > I was programmed in March
	who created you | > I was created by Saim (use your name)
	what can we talk about | > print a menu of the options the bot can respond to

	off | > haha you cannot turn me off I am invincible
	shutdown | > SHUTTING DOWN (program ends, user cannot type anymore)

     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean run = true;

        System.out.println("Hello, I am a chat bot.\nHow can I help or assist you today? ");


        while (run){
            System.out.print(">   ");
            String userInput = input.nextLine().toLowerCase().trim();

            switch (userInput){
                case "hello":
                    System.out.println("World");
                    break;
                case "who are you":
                    System.out.println("I am a chat bot.\nHow can I help you today?");
                    break;
                case "who created you":
                    System.out.println("I was created by Jenny. She is my mother. so I am a friend of you.\nYou can call me Jarvis.\nI am pleasure to help you out.");
                    break;
                case "can i talk with you":
                    System.out.println("Yes, sure.\nI am always besides by your side as long as you want. ");
                    break;
                case "off":
                    System.out.println("Haha, you can not turn me off. I am invincible.");
                    break;
                case "shutdown":
                    System.out.println("Okay.\nI am gonna leave you alone right away.");
                    run = false;
                    break;
                default:
                    System.out.println("I am sorry. I do not understand that.");
            }


        }

        input.close();




    }
}
