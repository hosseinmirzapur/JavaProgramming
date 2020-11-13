import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ans1="yes";
        String ans2;
        University university=new University();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "admin", "myjava123");
            while(ans1.equals("yes")) {
                university.entry();
                PreparedStatement preparedStatement = connection.prepareStatement("insert into student(code,name,year,average)values (?,?,?,?)");
                preparedStatement.setString(1, university.getCode());
                preparedStatement.setString(2, university.getName());
                preparedStatement.setString(3, university.getYear());
                preparedStatement.setString(4, university.getAverage());
                preparedStatement.executeUpdate();
                System.out.println("Do you want to change or remove data from a particular student?yes/no");
                ans1=scanner.nextLine();
                if(ans1.equals("no")){
                    System.out.println("Finished");
                }
                if (ans1.equals("yes")){
                    System.out.println("Change or Remove?c/r");
                    ans2= scanner.nextLine();
                    if(ans2.equals("r")){
                        System.out.println("Type the code of the student you want it's data to be removed:");
                        PreparedStatement preparedStatement1= connection.prepareStatement("delete from student where code=?");
                        preparedStatement1.setString(1,scanner.nextLine());
                        preparedStatement1.executeUpdate();
                        connection.commit();
                    }
                    if(ans2.equals("c")){
                        System.out.println("Type the code of the student you want it's data to be changed");
                        System.out.println("Type the new student's code for your student:");
                        PreparedStatement preparedStatement1=connection.prepareStatement("update student set code=? where code=?");
                        preparedStatement1.setString(1,scanner.nextLine());
                        preparedStatement1.setString(2,scanner.nextLine());
                        preparedStatement1.executeUpdate();
                        connection.commit();
                    }
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
