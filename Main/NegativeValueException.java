package Main;

public class NegativeValueException extends Exception {
    public NegativeValueException(){}

    public NegativeValueException(String message){
        super(String.valueOf(message));
    }

}
