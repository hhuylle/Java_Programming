package day05_operators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int a = 20;

        System.out.println(a); // a = 20
        System.out.println(a); // a = 20

        a = 40;

        System.out.println(a); // a = 40

        a = 90;

        System.out.println(a);
        System.out.println("------------------------------------");

        double balance = 100;

        balance += 1000; // balance = 100 + 1000

        System.out.println("Balance = $"+balance);

        balance += 500; // balance = 1100 + 500

        System.out.println("Balance = $"+balance);

        balance += 10000;

        System.out.println("Balance = $"+balance);

        balance -= 600; // balance = 11600 - 600

        System.out.println("Balance = $"+balance);

        balance -= 5000; // 11000 - 5000

        System.out.println("Balance = $"+balance);
        System.out.println(a);
        System.out.println("----------------------------------------------");

        double salary = 45000;
        salary *= 2; // salary = 45000 * 2

        System.out.println("salary = $"+salary);

        salary *= 3;

        System.out.println("salary = $"+salary);
        System.out.println("Balance = $"+balance);
        System.out.println(a);
        System.out.println("----------------------------------------------");

        double eth = 4;

        eth *= 250;

        System.out.println("eth = "+eth);

        eth /= 2; // eth = 1000 / 2

        System.out.println("eth = "+eth);
        System.out.println("Balance = $"+balance);
        System.out.println(a);
        System.out.println("----------------------------------------------");

        System.out.println("salary = " + salary);

        salary /= 2;

        System.out.println("salary = " + salary);
        System.out.println("Balance = $"+balance);
        System.out.println(a);
        System.out.println("----------------------------------------------");

        int b = 39;

        b %= 7; // b = 39 % 7

        System.out.println("b = "+b);




    }
}
