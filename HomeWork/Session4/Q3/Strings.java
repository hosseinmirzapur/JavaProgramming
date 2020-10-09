package Q3;

import java.util.Scanner;

public class Strings {
    public Strings(int a){
    }
    String s;
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Strings(){
        System.out.println("Program Started Successfully!\nEnter a string:");
    }
    public int numCheck(String s){
        if(s.contains("0")||s.contains("1")||s.contains("2")||s.contains("3")||s.contains("4")||s.contains("5")||s.contains("6")||s.contains("7")||s.contains("8")||s.contains("9")){
            return 1;
        }
        else
            return 0;

    }
    public void enterString(){
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();
        setS(s);
    }
}
