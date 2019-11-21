public class CalcTest {
    public static void main(String[] args) {
        Calc calc=new Calc();
        int x=10;
        int y=2;
        System.out.println("x="+x+" ;y="+y);
        try {
            System.out.println("x+y="+calc.sum(x, y));
        }
        catch (CalculatorException ex) {
            System.out.println("x+y="+ex.getMessage());
        }
        System.out.println("x-y="+calc.diff(x, y));
        try {
            System.out.println("x*y="+calc.mult(x, y));
        }
        catch (CalculatorException ex) {
            System.out.println("x*y="+ex.getMessage());
        }
        try {
            System.out.println("x/y="+calc.div(x, y));
        }
        catch (DivideByZeroException ex) {
            System.out.println("x/y="+ex.getMessage());
        }
        x=Integer.MAX_VALUE;
        System.out.println("x="+x+" ;y="+y);
        try {
            System.out.println("x+y="+calc.sum(x, y));
        }
        catch (CalculatorException ex) {
            System.out.println("x+y="+ex.getMessage());
        }
        System.out.println("x-y="+calc.diff(x, y));
        try {
            System.out.println("x*y="+calc.mult(x, y));
        }
        catch (CalculatorException ex) {
            System.out.println("x*y="+ex.getMessage());
        }
        y=0;
        System.out.println("x="+x+" ;y="+y);
        try {
            System.out.println("x/y="+calc.div(x, y));
        }
        catch (DivideByZeroException ex) {
            System.out.println("x/y="+ex.getMessage());
        }
    }
}
