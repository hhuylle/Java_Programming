package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i=10; i>=5; i--){ // i: 10, 9, 8, 7, 6, 5
            System.out.println("Hello Cydeo "+ i); // Hello Cydeo 10
             // Hello Cydeo 9
             // Hello Cydeo 8
             // Hello Cydeo 7
             // Hello Cydeo 6
             // Hello Cydeo 5
        }

        System.out.println("----------------------------------------");

        // sum of all the numbers 1 ~ 100
        int sum = 0;
        for (int i=1; i<=100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        // sum = 5050

        System.out.println("----------------------------------------");

        // print all the alphaet letters A ~ Z
        for (char ch='A'; ch<='Z'; ch++){
            System.out.print(ch +" "); // use print method to print all letters the same line
            // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
        }

        System.out.println("\n----------------------------------------");

        // print all the alphabet letters in backwards
        for (char ch='Z'; ch>='A'; ch--){
            System.out.print(ch +" ");
            // Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
        }



    }
}
