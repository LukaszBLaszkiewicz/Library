package main;

import java.sql.*;
import java.sql.DriverManager;

public class DatabaseManager {

    private Connection connection;
    private Statement statement;
   //=================================================================================================================================================
    public void connectToDatabase(String dbName, String username, String password){
       /* try{
            Class.forName("org.postgresql.DRIVER");
        } catch(ClassNotFoundException e){
            System.err.println("JDBC driver is missing");
            e.printStackTrace();
        }*/
        try{
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" +dbName,username,password);
            statement = connection.createStatement();
            System.out.println("Connection with database has been established");
            System.out.println(connection);
        } catch(SQLException e){
            System.err.println("Connection Error");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void createTablesInDatabase(){
        String createBookTable = "CREATE TABLE IF NOT EXIST books ( tu zmienne)";
        String createReadersTable = "CREATE TABLE IF NOT EXIST readers (tu zmienne)";
        String createLoansTable = "CREATE TABLE IF NOT EXIST loans (tu zmienne)";
        try{
            statement.execute(createBookTable);
            statement.execute(createReadersTable);
            statement.execute(createLoansTable);
        } catch(SQLException e){
            System.err.println("Error during tables creation");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addLibrarianToDatabase(Integer ID, String firstName, String lastName){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO readers values (?,?,?)");
            prepStat.setInt(1, ID);
            prepStat.setString(2, firstName);
            prepStat.setString(3, lastName);
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addBookToDatabase(Integer bookID, String bookTitle, String authorName, String authorLastname, String category){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO books values (?,?,?,?,?)");
            prepStat.setInt(1, bookID);
            prepStat.setString(2, bookTitle);
            prepStat.setString(3, authorName);
            prepStat.setString(4, authorLastname);
            prepStat.setString(5, category);
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding book to database");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addReaderToDatabase(Integer ID, String firstName, String lastName, String addressStreetName, Integer addressHouseNumber, String phoneNumber){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO readers values (?,?,?,?,?,?)");
            prepStat.setInt(1, ID);
            prepStat.setString(2, firstName);
            prepStat.setString(3, lastName);
            prepStat.setString(4, addressStreetName);
            prepStat.setInt(5, addressHouseNumber);
            prepStat.setString(6, phoneNumber);
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addLoanToDatabase(String issueDate, String dataReturned){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO readers values (?,?,?)");
            prepStat.setString(1, issueDate);
            prepStat.setString(2, dataReturned);

            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }


}
