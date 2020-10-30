import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your username, real name, password, age, home address, valid phone number, university degree in order:");
        Builder builder=new Builder().setUserName(scanner.nextLine()).setUserRealName(scanner.nextLine()).setPassword(scanner.nextLine()).setAge(Integer.parseInt(scanner.nextLine())).setHomeAdress(scanner.nextLine()).setPhoneNumber(scanner.nextLine()).setUniversityDegree(scanner.nextLine());
        System.out.println("Username:"+builder.getUserName());
        System.out.println("Real Name:"+builder.getUserRealName());
        System.out.println("Password:"+builder.getPassword());
        System.out.println("Age:"+builder.getAge());
        System.out.println("Home Address:"+builder.getHomeAdress());
        System.out.println("Phone number:"+builder.getUniversityDegree());
    }
}
