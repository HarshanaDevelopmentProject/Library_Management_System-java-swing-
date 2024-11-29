package exception;

public class EmptyFieldException extends Exception {  //for check empty field of text field

    public EmptyFieldException(String message) {
        super(message);
    }

}
