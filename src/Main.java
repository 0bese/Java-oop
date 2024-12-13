
public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding sample books to the library
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "123456789"));
        library.addBook(new Book("1984", "George Orwell", "987654321"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "192837465"));

        // Display all books in the library
        System.out.println("Welcome to the Library Management System!");
        System.out.println("Here are the available books:");
        library.displayBooks();

        //Borrow and return some books
        library.getBook(0).borrow();


        System.out.println("\n");
        //displaying after borrowing
        library.displayBooks();

        System.out.println("\n\n");
        library.getBook(0).returnBook();
        library.displayBooks();
    }
}