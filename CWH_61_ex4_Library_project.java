        // You have to implement a library using Java Class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books




class Library {
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books =0;
    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book: this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issuedBook(String book){
        for (int i =0 ; i<this.books.length; i++){
            if (this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook (String book){
        addBook(book);
    }
}

public class CWH_61_ex4_Library_project {
    public static void main(String[] args) {

        Library centralLibrary = new Library();

        // Added books
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Rich dad and Poor dad");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("java");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("DSA");

        // Show books
        centralLibrary.showAvailableBooks();

        // Issued books
        centralLibrary.issuedBook("C++");

        // Show books
        centralLibrary.showAvailableBooks();

        // Added Books
        centralLibrary.addBook("C++");

        // Show books
        centralLibrary.showAvailableBooks();


    }
}
