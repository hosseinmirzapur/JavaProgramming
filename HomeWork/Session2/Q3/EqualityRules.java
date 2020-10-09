package HomeWork.Q3;

import java.util.Scanner;

public class EqualityRules {
    Scanner scanner=new Scanner(System.in);
    public void equality(){
        System.out.println("Enter the capital letters' efficiencies:");
        System.out.println("Ax+by=c\ndx+ey=f");
        int a=Integer.parseInt(scanner.nextLine());
        System.out.println("ax+By=c\ndx+ey=f");
        int b=Integer.parseInt(scanner.nextLine());
        System.out.println("ax+by=C\ndx+ey=f");
        int c=Integer.parseInt(scanner.nextLine());
        System.out.println("ax+by=c\nDx+ey=f");
        int d=Integer.parseInt(scanner.nextLine());
        System.out.println("Ax+by=c\ndx+Ey=f");
        int e=Integer.parseInt(scanner.nextLine());
        System.out.println("Ax+by=c\ncx+dy=F");
        int f=Integer.parseInt(scanner.nextLine());
        if(a*d-b*c==0){
            System.out.println("This equation has no answers!");
        }
        else
            System.out.println("x="+(e*d-b*f)/(a*d-b*c)+"\ny="+(a*f-e*c)/(a*d-b*c));
    }
}
