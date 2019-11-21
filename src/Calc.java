public class Calc implements Calculator {
   public int sum(int x, int y) throws CalculatorException
    {
           if (((long)x+(long)y)>Integer.MAX_VALUE) throw new CalculatorException();
            return (x+y);
    }
    public int diff(int x, int y){
return (x-y);
    }
    public int mult(int x, int y) throws CalculatorException{
        if (((long)x*(long)y)>Integer.MAX_VALUE) throw new CalculatorException();
        return (x*y);
    }
    public int div(int x, int y) throws DivideByZeroException{
        if (y==0) throw new DivideByZeroException();
        return (x/y);
    }
}
