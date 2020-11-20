package controler;

import model.Entity;
import model.Service;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Login or sign up?(l/s)");
        String answer1=scanner.nextLine();
        if(answer1.equals("s")) {
            try {
                System.out.println("Enter the desired Info respectively:(username,password,name,email)");
                Service.getInstance().signup(new Entity().setUser(scanner.nextLine()).setPass(scanner.nextLine()).setName(scanner.nextLine()).setEmail(scanner.nextLine()));
                System.out.println("Saved successfully!");
            }catch (Exception e){
                System.out.println("Failed to save "+e.getMessage());
            }
        }
        if(answer1.equals("l")){
            try{
                System.out.println("Enter your Username and Password respectively:");
                Service.getInstance().login(new Entity().setUser(scanner.nextLine()).setPass(scanner.nextLine()));
            }catch (Exception e){
                System.out.println("Failed to Login "+e.getMessage());
            }
            System.out.println("Login Successfully!");
        }
        try {
            List<Entity> entityList=Service.getInstance().report();
            for(Entity entity: entityList){
                System.out.println(entity.getName());
                System.out.println(entity.getUser());
                System.out.println(entity.getPass());
                System.out.println(entity.getEmail());
            }
        }catch (Exception e){
            System.out.println("Failed to report!"+e.getMessage());
        }
    }
}
