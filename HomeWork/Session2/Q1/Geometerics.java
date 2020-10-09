package HomeWork.Q1;

import java.util.Scanner;

public class Geometerics {
    private Scanner scanner=new Scanner(System.in);
    public void geo(){
        System.out.println("Choose the number of the shape you want to operate with:");
        System.out.println("1.Square\n2.Rectangle\n3.Circle\n4.Diamond\n");
        switch (Integer.parseInt(scanner.nextLine())){
            case 1:
                System.out.println("Enter the length of the side:");
                int side=Integer.parseInt(scanner.nextLine());
                System.out.println("Perimeter:"+side*4);
                System.out.println("Surrounding:"+side*side);
                break;
            case 2:
                System.out.println("Enter the length of the 2 sides:");
                int side1=Integer.parseInt(scanner.nextLine()),side2=Integer.parseInt(scanner.nextLine());
                System.out.println("Perimeter:"+(side1+side2)*2);
                System.out.println("Surrounding:"+side1*side2);
                break;
            case 3:
                System.out.println("Enter the radius of your circle:");
                int r=Integer.parseInt(scanner.nextLine());
                System.out.println("Perimeter:"+2*3.14*r);
                System.out.println("Surrounding:"+3.14*r*r);
                break;
            case 4:
                System.out.println("Enter the length for the 2 diameters and the side:");
                int diameter1=Integer.parseInt(scanner.nextLine()),diameter2=Integer.parseInt(scanner.nextLine());
                int Side=Integer.parseInt(scanner.nextLine());
                System.out.println("Perimeter:"+Side*4);
                System.out.println("Surrounding:"+diameter1*diameter2/2);
                break;
            default :
                System.out.println("Wrong number inserted!");
                break;

        }
    }
}
