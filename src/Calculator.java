public interface Calculator {
    int sum(int x, int y) throws CalculatorException;
    int diff(int x, int y);
    int mult(int x, int y) throws CalculatorException;
    int div(int x, int y) throws DivideByZeroException;

}
