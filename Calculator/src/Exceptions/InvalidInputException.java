package Exceptions;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String msg){
        super(msg);
    }
    public InvalidInputException(){
    }
}
