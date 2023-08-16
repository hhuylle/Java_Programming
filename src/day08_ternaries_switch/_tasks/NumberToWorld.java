package day08_ternaries_switch._tasks;

public class NumberToWorld {

    public static void main(String[] args) {

        int num = 9;

        String number = num==1? "One": num==2? "Two": num==3? "Three": num==4? "Four": num==5? "Five": num==6? "Six": num==7? "Seven": num==8? "Eight": "Nine";

        System.out.println(number);


    }
}
