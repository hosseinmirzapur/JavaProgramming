package Class_Codes_0;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tell me how many numbers do you want to enter:");
        int n=Integer.parseInt(scanner.nextLine());
        int [] x=new int[n];
        int i;
        for(i=0;i<n;i++){
            System.out.println("Enter a number:");
            x[i]=Integer.parseInt(scanner.nextLine());
        }
        int max=0;
        for  (i=0;i<n;i++){
            if(max<x[i]){
                max=x[i];
            }
        }
        System.out.println("The biggest number you entered is:"+max);
    }
}
