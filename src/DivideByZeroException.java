public class DivideByZeroException extends CalculatorException {
    public DivideByZeroException(){
        super();
    }

    public DivideByZeroException(String message){
        super(message);
    }

    public String getMessage(){
        return ("Divide by zero error");
    }
}