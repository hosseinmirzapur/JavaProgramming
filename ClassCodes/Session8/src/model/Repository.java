package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable{
    private Connection connection;
    private PreparedStatement preparedStatement;
    public Repository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement("insert into website(username,password,name,email)values(?,?,?,?)");
        preparedStatement.setString(1, entity.getUser());
        preparedStatement.setString(2, entity.getPass());
        preparedStatement.setString(3, entity.getName());
        preparedStatement.setString(4, entity.getEmail());
        preparedStatement.executeUpdate();
    }
    public void update(Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement("update website set email=?,password=?,name=? where username=?");
        preparedStatement.setString(1, entity.getEmail());
        preparedStatement.setString(2, entity.getPass());
        preparedStatement.setString(3, entity.getName());
        preparedStatement.setString(4, entity.getUser());
        preparedStatement.executeUpdate();
    }
    public List<Entity> select()throws Exception{
        preparedStatement=connection.prepareStatement("SELECT * from website");
        ResultSet resultSet=preparedStatement.executeQuery();
        List<Entity> entityList=new ArrayList<>();
        while(resultSet.next()){
            Entity entity=new Entity();
            entity.setUser(resultSet.getString("username"));
            entity.setPass(resultSet.getString("password"));
            entity.setName(resultSet.getString("name"));
            entity.setEmail(resultSet.getString("email"));
        }
        return entityList;
    }
    public void commit() throws Exception{
        connection.commit();
    }
    public void rollback()throws Exception{
        connection.rollback();
    }
    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
