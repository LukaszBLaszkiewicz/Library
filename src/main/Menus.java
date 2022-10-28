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
        switch(librarianModeSwitch){
            case 1:
                //VIEW READERS DATABASE
                break;
            case 2:
                //VIEW BOOK DATABASE
                break;
            case 3:
                //VIEW LOAN DATABASE
                break;
            case 4:
                //VIEW EXPIRED LOANS
                break;
            case 5:
                //APPROVE NEW LOANS
                break;
            default:
                System.out.println("You chose wrong number!");
                break;
        }
    }

    public void readerMenu(){
        //STRING VARIABLE
        final Integer readerMenuSwitch;
        //SCANNER OBJECT
        Scanner readerMenuScanner = new Scanner(System.in);

        System.out.println("=======================READER MODE MENU=======================");
        System.out.println("1. MAKE ORDER"); // BOOK SEARCH MODE
        System.out.println("2. VIEW YOUR CARD");
        System.out.println("3. VIEW BOOKS DATABASE");
        System.out.println("4. BACK TO MAIN MENU");
        System.out.println("Your choice: ");
        readerMenuSwitch = readerMenuScanner.nextInt();
        switch(readerMenuSwitch){
            case 1:
                //MAKE ORDER
                break;
            case 2:
                //VIEW YOUR CARD
                break;
            case 3:
                //VIEW BOOKS DATABASE
                break;
            case 4:
                //BACK TO MAIN MENU
                break;
            default:
                System.out.println("You chose wrong number!");
                break;
        }
    }
    public void mainMenu(){
        //SWITCH VARIABLE
        final Integer mainMenuSwitch;
        //SCANNER OBJECT
        Scanner mainMenuScanner = new Scanner(System.in);

        System.out.println("=======================MAIN MENU=======================");
        System.out.println("1. LOGIN");
        System.out.println("2. REGISTER");
        System.out.println("Your choice: ");
        mainMenuSwitch=mainMenuScanner.nextInt();
        switch(mainMenuSwitch){
            case 1:
                //LOGIN
                //AS READER, AS LIBRARIAN
                break;

            case 2:
                //REGISTER
                //AS READER, AS LIBRARIAN
                break;
        }
    }
}
