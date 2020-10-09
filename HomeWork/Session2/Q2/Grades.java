package HomeWork.Q2;

import java.util.Scanner;

public class Grades {
    private Scanner scanner=new Scanner(System.in);
    public void grades(){
        int [][]x=new int[5][2];
        int i,j,sumT=0,sum=0;
        System.out.println("Enter 5 grades and requested information!");
        for(i=0;i<5;i++){
            System.out.println("Enter firstly the grade and secondly the efficiency:");
            for (j=0;j<2;j++){
                x[i][j]=Integer.parseInt(scanner.nextLine());
                sumT+=x[i][0]*x[i][1];
                sum+=x[i][1];
            }
        }
        System.out.println("The average is:"+sumT/sum);
        if((sumT/sum)<10){
            System.out.println("You have Failed!");
        }
        else
            System.out.println("Congratulations!\nYou have successfully passed the term!");
    }
}
