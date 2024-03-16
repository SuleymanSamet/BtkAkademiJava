import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String username="root";
    private String password="1234";
    private String dbUrl="jdbc:mysql://localhost:3306/sakila";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,username,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("error:"+exception.getMessage());
        System.out.println("error code : "+exception.getErrorCode());
    }
}
