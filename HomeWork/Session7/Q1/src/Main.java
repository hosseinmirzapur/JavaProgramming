import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String answer="yes";
        Info info=new Info();

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","myjava123");
            while (answer.equals("yes")) {
                info.entry();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into information(usercode,username,email,password,age,degree) values (?,?,?,?,?,?)");
                preparedStatement.setString(1, info.getUsercode());
                preparedStatement.setString(2, info.getUsername());
                preparedStatement.setString(3, info.getEmail());
                preparedStatement.setString(4, info.getPassword());
                preparedStatement.setString(5, info.getAge());
                preparedStatement.setString(6, info.getDegree());
                preparedStatement.executeUpdate();
                System.out.println("Do you want to enter more info?");
                answer = scanner.nextLine();
                if(answer.equals("no")){
                    System.out.println("Finished!");
                    break;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
