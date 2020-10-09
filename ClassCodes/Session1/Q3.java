package Class_Codes_0;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        System.out.println("Now tell me what do you want to do with these two numbers:\n1.Zarb\n2.Jam\n3.Tafrigh\n4.Taghsim");
        int ans=Integer.parseInt(scanner.nextLine());
        switch (ans){
            case 1:
                System.out.println("The result is:"+num1*num2);
                break;
            case 2:
                System.out.println("The result is:"+(num1+num2));
                break;
            case 3:
                System.out.println("The result is:"+(num1-num2));
                break;
            case 4:
                System.out.println("The result is:"+num1/num2);
        }
    }
}
