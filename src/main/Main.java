package main;

public class Main {
    public static void main(String[] args) {
        DatabaseManager db = new DatabaseManager();
        db.connectToDatabase("postgres", "postgres", "Twojastara95!");
    }
}