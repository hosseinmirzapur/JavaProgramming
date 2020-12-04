package Model.Repository;

import Model.Entity.PersonEntity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WorkerRepository implements AutoCloseable{
    private final Connection connection;
    private PreparedStatement preparedStatement;
    public WorkerRepository()throws Exception{
        Class.forName ("oracle.jdbc.driver.OracleDriver");
        connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","admin","myjava123");
        connection.setAutoCommit(false);
    }
    public void insert(PersonEntity personEntity) throws Exception{
        preparedStatement=connection.prepareStatement("insert into worker(name,nationalid,birthdate,mobilenumber,fathername,visaid,birthplace,phonenumber,dateentry)values (?,?,?,?,?,?,?,?,?)");
        preparedStatement.setString(1,personEntity.getName());
        preparedStatement.setString(2, personEntity.getNationalID());
        preparedStatement.setString(3, personEntity.getBirthDate());
        preparedStatement.setString(4, personEntity.getMobileNumber());
        preparedStatement.setString(5, personEntity.getFatherName());
        preparedStatement.setString(6, personEntity.getVisaID());
        preparedStatement.setString(7, personEntity.getBirthPlace());
        preparedStatement.setString(8, personEntity.getPhoneNumber());
        preparedStatement.setString(9, personEntity.getDateEntry());
        preparedStatement.executeUpdate();
    }
    public void commit() throws Exception{
        connection.commit ();
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
