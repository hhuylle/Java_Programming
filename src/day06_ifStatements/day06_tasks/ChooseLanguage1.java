package day06_ifStatements.day06_tasks;

public class ChooseLanguage1 {

    public static void main(String[] args) {

        int num = 7;


        String language = num==1? "Hello, thank for your call": num==2? "Hola, gracias para llamar": num==3? "Merhaba, aradiginiz icin tesekkurler": num==4? "Privet, spasibo za vash zvonok": num==5? "Merci ,pour votre appel": "Invalid number";

        System.out.println(language);



    }

}
