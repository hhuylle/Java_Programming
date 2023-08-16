package day08_ternaries_switch._tasks;

public class ChooseLanguage2 {

    public static void main(String[] args) {

        int num = 1;

        String result = "";

        switch (num){
            case 1:
                System.out.println("Hello, thank for your call");
                break;
            case 2:
                System.out.println("Hola, gracias para llamar");
                break;
            case 3:
                System.out.println("Merhaba, aradiginiz icin tesekkurler");
                break;
            case 4:
                System.out.println("Privet, spasibo za vash zvonok");
                break;
            case 5:
                System.out.println("Merci ,pour votre appel");
                break;
            default:
                System.out.println("Invalid Number");

        }
        System.out.println(result);


    }
}
