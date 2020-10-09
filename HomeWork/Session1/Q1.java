package Homework_0;
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        q1class obj=new q1class();
        System.out.println("How many numbers do you want to enter?");
        int n=Integer.parseInt(scanner.nextLine());
        int[]x=new int[n];
        int i;
        for (i=0;i<n;i++){
            System.out.println("Enter your number:");
            x[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Enter a number you want to be searched in the array:");
        int num=Integer.parseInt(scanner.nextLine());
        obj.check(x,num,n);
    }
}
