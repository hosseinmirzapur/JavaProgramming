import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ChooseOption chooseOption=new ChooseOption();
        Scanner scanner=new Scanner(System.in);
        int optionalNum=Integer.parseInt(scanner.nextLine());
        if (optionalNum==1){
            chooseOption.login();
        }
        if(optionalNum==2){
            chooseOption.signUp();
            chooseOption.login();
        }
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection= DriverManager.getConnection(url,"admin","myjava123");
            PreparedStatement preparedStatement=connection.prepareStatement("insert into information(name,username,password,email) values (?,?,?,?)");
            preparedStatement.setString(1,chooseOption.getName());
            preparedStatement.setString(2,chooseOption.getUsername());
            preparedStatement.setString(3,chooseOption.getPassword());
            preparedStatement.setString(4,chooseOption.getEmail());
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}
