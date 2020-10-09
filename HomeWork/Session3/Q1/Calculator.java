package Session3.Q1;



import java.util.Scanner;

public class Calculator implements Operations{
    public Calculator(){
        System.out.println("Enter 2 numbers and then choose what option do you want it to be used:");
        System.out.println("1.Jam");
        System.out.println("2.Tafrigh");
        System.out.println("3.Zarb");
        System.out.println("4.Taghsim");
    }
    private Scanner scanner=new Scanner(System.in);
    @Override
    public void SM(double a, double b) {
        System.out.println("The Answer is:"+(a+b));
    }

    @Override
    public void MP(double a, double b) {
        System.out.println("The Answer is:"+(a*b));
    }

    @Override
    public void DV(double a, double b) {
        System.out.println("The Answer is:"+(a/b));
    }

    @Override
    public void FR(double a, double b) {
        System.out.println("The Answer is:"+(a-b));
    }
    public void Check(){
        a=getA();
        b=getB();
        optionalNum=getOptionalNum();
        switch (optionalNum){
            case 1:
                SM(a,b);
                break;
            case 2:
                FR(a,b);
                break;
            case 3:
                MP(a,b);
                break;
            case 4:
                DV(a,b);
                break;
            default:
                System.out.println("Invalid Number!");
        }
    }
    public double a;
    public double b;
    public int optionalNum;
    public double getA() {
        a=Double.parseDouble(scanner.nextLine());
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        b=Double.parseDouble(scanner.nextLine());
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int getOptionalNum() {
        optionalNum=Integer.parseInt(scanner.nextLine());
        return optionalNum;
    }

    public void setOptionalNum(int optionalNum) {
        this.optionalNum = optionalNum;
    }

}
