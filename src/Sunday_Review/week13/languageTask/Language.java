package Sunday_Review.week13.languageTask;

public interface Language {

    String DEFAULT_ENCODING = "UTF-8"; // it is public static final automatically

    void hello();

    void bye();

    static void description(){
        System.out.println("Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together");
    }

    default void translate(Language lang, String msg){
        System.out.println("Translating " +  msg + " in " + getClass().getSimpleName() + " into " + lang.getClass().getSimpleName());
    }


}
/*
Language [interface, polymorphism, method]

	create an interface Language
	create a constant variable: DEFAULT_ENCODING = "UTF-8";
	create abstract methods: hello() & bye()
	create a static method: description()
		print a message about languages: "Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together"

	create a default method translate(Language l, String msg)
		return: void
		parameters: Language
		use this code: System.out.println("Translating " +  msg + " in " + getClass().getSimpleName() + " into " + l.getClass().getSimpleName());

	create a class English and implement Language
	create a class Spanish and implement Language
	add as many languages as you want
	test the description and translates methods
 */
