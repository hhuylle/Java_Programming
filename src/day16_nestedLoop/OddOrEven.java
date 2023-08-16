package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")){
            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if (num%2==0){
                System.out.println(num+" is Even number");
            }else {
                System.out.println(num+" is odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){ // while the user provides invalid number
                System.err.println("Invalid entry, please answer the question again: ");
                answer = input.next().toLowerCase();
            }
            if (answer.equals("no")){
                break;
            }
        }

        input.close();



    }
}
