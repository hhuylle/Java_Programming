package day09_scanner;

public class IfAndSwitch {
    public static void main(String[] args) {


        int num = 100;

        if (num==50 || num==75 || num==100){

            switch (num){
                case 50:
                    System.out.println("20 crew, 30 passengers");
                    break;
                case 75:
                    System.out.println("25 crew, 50 passengers");
                    break;
                default:
                    System.out.println("30 crew, 70 passengers");
            }

        }else{
            System.out.println("Invalid number");
        }
    }
}
