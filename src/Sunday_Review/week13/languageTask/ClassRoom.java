package Sunday_Review.week13.languageTask;

public class ClassRoom {

    public static void main(String[] args) {

        //Language obj = new Language(); cannot instantiate an interface

        English english = new English();
        english.hello();
        english.bye();

        System.out.println();

        Spanish spanish = new Spanish();
        spanish.hello();
        spanish.bye();

        System.out.println();

        Vietnamese vietnamese = new Vietnamese();
        vietnamese.hello();
        vietnamese.bye();

        System.out.println();

        System.out.println(spanish.DEFAULT_ENCODING);// it works but it's not good option
        System.out.println(Language.DEFAULT_ENCODING);// it works in correct way to access

        //english.description();// static methods are NOT inherited from interface

        Language.description();

        System.out.println();

        english.translate(spanish, "Hello, how are you?");


    }
}
