package Q2;

public class ExceptionFactory extends Exception {
    Equation equation=new Equation();
    public ExceptionFactory(String msg){
        super(msg);
    }
    public ExceptionFactory(){}
    public void checkDelta(double delta) throws ExceptionFactory {
        if (delta<0){
            System.out.println("This Equation has no answers!\nRun the program again!");
            System.exit(1);
        }

    }
    public void checkA(int a)throws ExceptionFactory{
        if(a==0){
            System.out.println("The first coefficient is zero!\nRun the program again!");
            System.exit(1);
        }

    }
}
