public class CalculatorException extends Exception {
    public CalculatorException(){
        super();
    }

    public CalculatorException(String message){
        super(message);
    }

    public String getMessage(){
        return ("Numeric overflow error");
    }
}

