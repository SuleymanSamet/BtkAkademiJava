import java.sql.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)throws SQLException{
        //delete
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        try {
            connection= dbHelper.getConnection();
            String sql="delete from actor where actor_id=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,202);
            statement.executeUpdate();
            System.out.println("Kayıt Silindi");
        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }


    }
    public static void selectDemo()throws SQLException{
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        Statement statement=null;
        ResultSet resultSet;
        try {
            connection= dbHelper.getConnection();
            statement= connection.createStatement();
            resultSet=statement.executeQuery("SELECT * FROM sakila.actor;");
            ArrayList<Actor>actors=new ArrayList<Actor>();
            while (resultSet.next()){
                actors.add(new Actor(resultSet.getString("first_name"),resultSet.getString("last_name")));
            }
            System.out.println(actors.size());
        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            connection.close();
        }

    }
    public static void insertData()throws SQLException{
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        try {
            connection= dbHelper.getConnection();
            String sql="insert into actor(first_name,last_name) values (?,?)";
            statement=connection.prepareStatement(sql);
            statement.setString(1, "Polat");
            statement.setString(2,"Alemdar");
            statement.executeUpdate();
            System.out.println("Kayıt eklendi");
        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }
    }
    public static void updateData() throws SQLException {
        Connection connection=null;
        DbHelper dbHelper=new DbHelper();
        PreparedStatement statement=null;
        ResultSet resultSet;
        try {
            connection= dbHelper.getConnection();
            String sql="update actor set first_name='Süleyman' where actor_id=?";
            statement=connection.prepareStatement(sql);
            statement.setInt(1,202);
            statement.executeUpdate();
            System.out.println("Kayıt güncellendi");
        }catch (SQLException exception){
            dbHelper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close();
        }


    }
}