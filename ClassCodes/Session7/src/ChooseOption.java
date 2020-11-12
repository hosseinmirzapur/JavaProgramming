import java.util.Scanner;
public class ChooseOption {
    String name;
    String username;
    String password;
    String email;
    Scanner scanner=new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ChooseOption(){
        System.out.println("Welcome to our website!\nChoose Login or Sign up:\n(1 for Login and 2 for sign up)");
    }
    public void signUp(){
        System.out.println("Enter your name:");
        setName(scanner.nextLine());
        System.out.println("Enter your username:");
        setUsername(scanner.nextLine());
        System.out.println("Enter your password:");
        setPassword(scanner.nextLine());
        System.out.println("Enter your Email:");
        setEmail(scanner.nextLine());
    }
    public void login(){
        String username=scanner.nextLine();
        String password=scanner.nextLine();
        System.out.println();
        if(username.equals(ChooseOption.this.getUsername()) && password.equals(ChooseOption.this.getPassword())){
            System.out.println("Entry successful!");
        }
        else{
            System.out.println("Failed to login!");
        }
    }

}
