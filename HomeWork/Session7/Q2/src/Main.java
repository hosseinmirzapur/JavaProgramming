import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeInfo employeeInfo=new EmployeeInfo();
        String answer1="yes";
        String answer2;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","myjava123");
            while(answer1.equals("yes")) {
                employeeInfo.entry();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into employee(employeecode,employeename,mellicode,fathername,role,salary,resume) values (?,?,?,?,?,?,?)");
                preparedStatement.setString(1, employeeInfo.getEmployeeCode());
                preparedStatement.setString(2, employeeInfo.getEmployeeName());
                preparedStatement.setString(3, employeeInfo.getMelliCode());
                preparedStatement.setString(4, employeeInfo.getFatherName());
                preparedStatement.setString(5, employeeInfo.getRole());
                preparedStatement.setString(6, employeeInfo.getSalary());
                preparedStatement.setString(7, employeeInfo.getResume());
                preparedStatement.executeUpdate();
                System.out.println("Do you want any employee to be removed?(yes/no)");
                answer2=scanner.nextLine();
                if(answer2.equals("yes")) {
                    System.out.println("Enter the code of the employee which you want his/her info be removed:");
                    PreparedStatement preparedStatement1 = connection.prepareStatement("delete from employee where employeescode=?");
                    preparedStatement1.setString(1, scanner.nextLine());
                    preparedStatement1.executeUpdate();
                    connection.commit();
                }
                System.out.println("Do you want to continue?(yes/no)");
                answer1=scanner.nextLine();
                if (answer1.equals("no")){
                    System.out.println("Finished!");
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
