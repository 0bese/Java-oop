import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> libBooks;

    Library(){
        this.libBooks = new ArrayList<>();
    }

    void addBook(Book book){
        libBooks.add(book);
    }

    public void displayBooks(){
        for (Book b : libBooks){
            System.out.println(b);
        }
    }

    public Book getBook(int id) {
        return libBooks.get(id);
    }

}
