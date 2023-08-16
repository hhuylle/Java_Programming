package day38_exceptionsContinue_throws_throw_keyword.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message){
        super(message);
    }

}
