package Q2;

import java.util.Scanner;

public class Operations implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    Scanner scanner=new Scanner(System.in);
    WebsiteInfo websiteInfo=new WebsiteInfo();
    ExceptionFactory exceptionFactory=new ExceptionFactory();
    public void webSiteOperations(){
        System.out.println("Enter your first name:");
        websiteInfo.setFirstname((Object)scanner.nextLine());
        System.out.println("Enter your Last name:");
        websiteInfo.setLastname((Object)scanner.nextLine());
        System.out.println("Enter tour Username:");
        websiteInfo.setUsername((Object) scanner.nextLine());
        System.out.println("Enter your Password:");
        websiteInfo.setPassword((Object) scanner.nextLine());
        try {
            exceptionFactory.getException(websiteInfo.getFirstname(),websiteInfo.getLastname(),websiteInfo.getUsername(),websiteInfo.getPassword());
        }catch (ExceptionFactory exceptionFactory){
            System.out.println(exceptionFactory.getMessage());
        }
    }
}
