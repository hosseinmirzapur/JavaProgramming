package Session3.Q3;

import java.util.Scanner;

public class NumberInfo implements MyInteger{
    public NumberInfo(){
        System.out.println("Enter a number to see its info:");
    }
    private Scanner scanner=new Scanner(System.in);
    @Override
    public void isEven(int num) {
        System.out.println("The number you entered is even!");
    }

    @Override
    public void isNegative(int num) {
        System.out.println("The number you entered is negative!");
    }

    @Override
    public void isOdd(int num) {
        System.out.println("The number you entered is odd!");
    }

    @Override
    public void isPositive(int num) {
        System.out.println("The number you entered is positive");
    }
    public void Check(){
        num=getNum();
        setNum(num);
        if(num%2==0)
            isEven(num);
        if(num%2==1)
            isOdd(num);
        if(num>0)
            isPositive(num);
        if(num<0)
            isNegative(num);
    }
    public int num;
    public int getNum() {
        num=Integer.parseInt(scanner.nextLine());
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
