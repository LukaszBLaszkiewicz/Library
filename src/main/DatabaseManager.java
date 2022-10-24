package main;

import java.sql.*;

public class DatabaseManager {

    public static final String DRIVER = "org.sqlite.JDBC";
    public static final String DB_URL = " ";

    private Connection connection;
    private Statement statement;
    //====================================================================================================================================================
    public void createNewDatabase(){
        try(Connection conn = DriverManager.getConnection(DB_URL)) {
            if(conn != null) {
                DatabaseMetaData meta = connection.getMetaData();
                System.out.println("The driver name is: " + meta.getDriverName());
                System.out.println("A new database has been created");

            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //====================================================================================================================================================
    public void connectToDatabase(){
        try{
            Class.forName(DatabaseManager.DRIVER);
        } catch(ClassNotFoundException e){
            System.err.println("JDBC driver is missing");
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(DB_URL);
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
        } catch(SQLException e){
            System.err.println("Error during tables creation");
            e.printStackTrace();
        }
    }
    //====================================================================================================================================================
}
