package day08_ternaries_switch;

public class OxygenTank {

    public static void main(String[] args) {

        int number = 72;

        String level = (number>50 && number<=100)? number>90? "Your tank is full": number>80? "Still okay": number>70? "Don't go too far": number>60? "Start to head back": "Be careful now you're at 50%": "Your tank is run out of oxygen";

        System.out.println(level);





    }
}
