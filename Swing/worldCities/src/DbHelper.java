
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class DbHelper {
    private String userName="root";
    private String password="1234";
    private String dbUrl="jdbc:mysql://localhost:3306/sakila";
    
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
        
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error"+exception.getMessage());
        System.out.println("Error code : "+exception.getErrorCode());
        
    }
}
