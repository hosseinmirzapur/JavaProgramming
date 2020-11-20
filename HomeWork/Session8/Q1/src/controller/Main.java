package controller;

import model.Entity;
import model.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String answer="n";
        System.out.println("First Enter your username and password then choose a number for an option:\n1. 2 GB ----> 1000 Toman\n2. 4 GB ----> 2000 Toman\n3. 10 GB ----> 5000 Toman\n4. 25 GB ----> 10000 Toman");
        try {
            while(answer.equals("n")) {
                Service.getInstance().update(new Entity().setUser(scanner.nextLine()).setPass(scanner.nextLine()).setCost(0).setInternet(0), Integer.parseInt(scanner.nextLine()));
                System.out.println("Is it finished?(y/n)");
                answer=scanner.nextLine();
            }
        }catch (Exception e){
            System.out.println("Failed!"+e.getMessage());
        }
        System.out.println("Finished!");
    }
}
