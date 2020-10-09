package Q2;

public class Main {
    public static void main(String[] args) throws ExceptionFactory {
        ExceptionFactory exceptionFactory=new ExceptionFactory();
        Equation equation=new Equation("equation");
        equation.entry();
        double delta=equation.delta(equation.getA(),equation.getB(),equation.getC());
        try {
            exceptionFactory.checkDelta(delta);
        }catch (ExceptionFactory e){
        }
        try {
            exceptionFactory.checkA(equation.getA());
        }catch (ExceptionFactory e){
        }
        equation.equationAnswer(equation.getA(),equation.getB(),equation.getC(),delta);
    }
}
