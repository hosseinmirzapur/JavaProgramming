import java.util.Scanner;

public class EmployeeInfo {
    public EmployeeInfo(){
        System.out.println("Enter the entry requested!\n");
    }
    Scanner scanner=new Scanner(System.in);
    public String getEmployeeCode() {
        return employeeCode;
    }
    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getMelliCode() {
        return melliCode;
    }
    public void setMelliCode(String melliCode) {
        this.melliCode = melliCode;
    }
    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getResume() {
        return resume;
    }
    public void setResume(String resume) {
        this.resume = resume;
    }
    String employeeCode;
    String employeeName;
    String melliCode;
    String fatherName;
    String role;
    String salary;
    String resume;
    public void entry(){
        System.out.println("Enter Employee code:");
        setEmployeeCode(scanner.nextLine());
        System.out.println("Enter Employee name:");
        setEmployeeName(scanner.nextLine());
        System.out.println("Enter Melli code:");
        setMelliCode(scanner.nextLine());
        System.out.println("Enter Father's name:");
        setFatherName(scanner.nextLine());
        System.out.println("Enter employees role:");
        setRole(scanner.nextLine());
        System.out.println("Enter Salary:");
        setSalary(scanner.nextLine());
        System.out.println("Enter your resume:");
        setResume(scanner.nextLine());
    }
}
