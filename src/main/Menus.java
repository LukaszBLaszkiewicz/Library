package main;
import java.util.Scanner;

public class Menus {

    public void librarianMenu(){
        //STRING VARIABLES
        final Integer librarianModeSwitch;
        //SCANNER OBJECTS
        Scanner librarianModeScanner = new Scanner(System.in);
        System.out.println("=======================LIBRARIAN MODE MENU=======================");
        System.out.println("1. View readers database");
        System.out.println("2. View books database");
        System.out.println("3. View loans database");
        System.out.println("4. Check expired loans");
        System.out.println("5. Approve new loans");
        System.out.println("Your choice:");
        librarianModeSwitch = librarianModeScanner.nextInt();
        //Viewing database od readers, books, loans
        //Approval for loans
    }

    public void readerMenu(){
        //Viewing database of books
        //Viewing own card with loans
        //Ordering books
    }

    public void mainMenu(){
        //Register
            //AS A LIBRARIAN
            //AS A READER
        //Login
            //AS A LIBRARIAN
            //AS A READER
    }
}
