import java.util.Scanner;

public class Info {
    public Info(){
        System.out.println("Hello and welcome to our website!");
    }
    Scanner scanner=new Scanner(System.in);
    String usercode,username,password,email,age,degree;
    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void entry(){
        System.out.println("Enter the data requested by website to proceed!");
        System.out.println("Enter your usercode:");
        setUsercode(scanner.nextLine());
        System.out.println("Enter your username:");
        setUsername(scanner.nextLine());
        System.out.println("Enter your password:");
        setPassword(scanner.nextLine());
        System.out.println("Enter your email:");
        setEmail(scanner.nextLine());
        System.out.println("How old are you:");
        setAge(scanner.nextLine());
        System.out.println("Enter your educational degree:");
        setDegree(scanner.nextLine());
    }
}
