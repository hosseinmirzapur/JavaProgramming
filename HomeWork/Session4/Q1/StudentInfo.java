package Q1;

import java.util.Scanner;

public class StudentInfo {
    Scanner scanner=new Scanner(System.in);
    public StudentInfo(){
        System.out.println("Program Started Successfully!");
    }
    public String studentName;
    public String Username;
    public String Password;
    public void start(){
        System.out.println("Welcome to the university's private panel!");
        System.out.println("Follow the steps bellow for signing in:");
        System.out.println("1.Enter your name and family name:\n2.Enter your username:\n3.Enter your password:");
    }
    public void Entry(){
        System.out.println("Enter Your Name:");
        studentName=scanner.nextLine();
        setStudentName(studentName);
        System.out.println("Enter Your Username:");
        Username=scanner.nextLine();
        setUsername(Username);
        System.out.println("Enter Your Password:");
        Password=scanner.nextLine();
        setPassword(Password);
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}