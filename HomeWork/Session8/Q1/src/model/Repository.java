package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class Repository implements AutoCloseable{
    private final Connection  connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","myjava123");;
    private PreparedStatement preparedStatement;

    public Repository()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection.setAutoCommit(false);
    }
    public void update(Entity entity) throws Exception{
        preparedStatement=connection.prepareStatement("update hamraheaval set cost=?,internet=? where username=?");
        preparedStatement.setLong(1,entity.cost);
        preparedStatement.setLong(2,entity.internet);
        preparedStatement.setString(3,entity.getUser());
        preparedStatement.executeUpdate();
    }
    public void commit() throws Exception{
        connection.commit();
    }
    public void rollback() throws Exception{
        connection.rollback();
    }
    @Override
    public void close() throws Exception {
        connection.close();
        preparedStatement.close();
    }
}
