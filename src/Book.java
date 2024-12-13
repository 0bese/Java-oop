public class Book {
    String title;
    String author;
    String isbn;
    Boolean isBorrowed;

    Book(String t, String a, String i){
        this.title = t;
        this.author = a;
        this.isbn = i;
        this.isBorrowed = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public void borrow(){
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook(){
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("Book is not currently borrowed.");
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Author: %s, ISBN: %s, Borrowed: %s",
                title, author, isbn, isBorrowed ? "Yes" : "No");
    }
}
