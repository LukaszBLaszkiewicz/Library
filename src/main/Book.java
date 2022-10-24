package main;

public class Book {
    private Integer bookID;
    private String bookTitle;
    private String authorName;
    private String authorLastname;
    private String category;

    public Book(String bookTitle, String authorName, String authorLastname, String category){
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.authorLastname = authorLastname;
        this.category = category;
    }

    public Integer getBookID() {
        return bookID;
    }

    public void setBookID(Integer bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastname() {
        return authorLastname;
    }

    public void setAuthorLastname(String authorLastname) {
        this.authorLastname = authorLastname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
