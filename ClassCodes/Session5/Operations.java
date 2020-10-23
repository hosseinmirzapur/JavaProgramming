import java.util.Scanner;
public class Operations {
    ExceptionFactory exceptionFactory=new ExceptionFactory();
    Information information=new Information();
    Scanner scanner=new Scanner(System.in);
    public Operations(){ }
    public void settings() throws ExceptionFactory{
        System.out.println("Enter your First Name:");
        information.setName(scanner.nextLine());
        System.out.println("Enter your Last Name:");
        information.setFamily(scanner.nextLine());
        System.out.println("Enter your Age:");
        information.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter your Username:");
        information.setUsername(scanner.nextLine());
        System.out.println("Enter your Password:");
        information.setPass(scanner.nextLine());
        System.out.println("Enter you Job:");
        information.setJob(scanner.nextLine());
        try{
            exceptionFactory.getException(information.getName(),information.getFamily(),information.getAge(),information.getUsername(),information.getPass());
        }catch (ExceptionFactory e){
            System.out.println(e.getMessage());
        }
        System.out.println("Finished!");
    }
}
