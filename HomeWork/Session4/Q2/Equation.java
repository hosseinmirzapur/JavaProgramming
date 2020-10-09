package Q2;

import java.util.Scanner;

public class Equation {
    public Equation(String str) {
        System.out.println("Program Started Successfully!");
    }
    public Equation(){}
    public int a;
    public int b;
    public int c;
    public double delta(int a,int b,int c){
        return ((Math.pow(b,2))-4*a*c);
    }
    public void equationAnswer(int a,int b,int c,double delta){
        if (delta==0){
            double answer=(-b)/(a*2);
            System.out.println("The only answer is:"+answer);
        }
        if (delta>0){
            double answer1=((-b)+Math.sqrt(delta))/(a*2);
            double answer2=((-b)-Math.sqrt(delta))/(a*2);
            System.out.println("The 2 answers are:"+answer1+" and "+answer2);
        }
    }
    public void entry(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a:");
        a=Integer.parseInt(scanner.nextLine());
        setA(a);
        System.out.println("Enter b:");
        b=Integer.parseInt(scanner.nextLine());
        setB(b);
        System.out.println("Enter c:");
        c=Integer.parseInt(scanner.nextLine());
        setC(c);
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


}
