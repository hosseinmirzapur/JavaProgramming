package Homework_0;

public class q1class {
    boolean check(int[]x,int num,int n){
        int i;
        int repeat=0;
        for(i=0;i<n;i++){
            if(x[i]==num){
                repeat++;
            }
        }
        if(repeat>0){
            System.out.println("The number you're looking for has been repeated "+repeat+" times!");
            return true;}
        else{
            System.out.println("Your number wasn't found on the array!");
            return false;}

    }
}
