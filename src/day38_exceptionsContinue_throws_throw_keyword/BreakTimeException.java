package day38_exceptionsContinue_throws_throw_keyword;

public class BreakTimeException extends RuntimeException{

    public BreakTimeException(){
        super("It's break time");
    }

    public BreakTimeException(String message){
        super(message);
    }

}
