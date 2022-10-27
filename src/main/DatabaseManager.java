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
    public void addLibrarianToDatabase(Librarian librarian){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO readers values (?,?,?)");
            prepStat.setInt(1, librarian.getID());
            prepStat.setString(2, librarian.getFirstName());
            prepStat.setString(3, librarian.getLastName());
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addBookToDatabase(Book book){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO books values (?,?,?,?,?)");
            prepStat.setInt(1, book.getBookID());
            prepStat.setString(2, book.getBookTitle());
            prepStat.setString(3, book.getAuthorName());
            prepStat.setString(4, book.getAuthorLastname());
            prepStat.setString(5, book.getCategory());
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding book to database");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addReaderToDatabase(Reader reader){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO readers values (?,?,?,?,?,?)");
            prepStat.setInt(1, reader.getId());
            prepStat.setString(2, reader.getName());
            prepStat.setString(3, reader.getLastName());
            prepStat.setString(4, reader.getAddressStreetName());
            prepStat.setInt(5, reader.getAddressHouseNumber());
            prepStat.setInt(6, reader.getPhoneNumber());
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
    public void addLoanToDatabase(Reader reader, Book book, Librarian librarian){
        try{
            PreparedStatement prepStat = connection.prepareStatement("INSERT INTO readers values (?,?,?,?,?,?,?,?)");
            prepStat.setInt(1, book.getBookID());
            prepStat.setString(2, book.getBookTitle());
            prepStat.setInt(3, reader.getId());
            prepStat.setString(4, reader.getName());
            prepStat.setString(5, reader.getLastName());
            prepStat.setInt(6, librarian.getID());
            prepStat.setString(7, librarian.getFirstName());
            prepStat.setString(8, librarian.getLastName());
            prepStat.execute();
        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }
    //SHOW READERS DATABASE
    //SHOW BOOKS DATABASE - WITH FLAG HOW MANY IS AVAIABLE
    //SHOW LOANS DATABASE
    //SHOW READER ACCOUNT
    //SHOW PENALTIES
    //====================================================================================================================================================
    public void showReadersDatabase(){
        try{
            ResultSet readersDatabase = statement.executeQuery("SELECT * from readers values");

        }catch(SQLException e){
            System.err.println("Error during adding readers to database");
            e.printStackTrace();
        }
    }
}
