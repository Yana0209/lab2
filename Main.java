package org.example;

public class Main {
    public static void main(String[] args) {

        // Creating an instance of the Library class
        Library library = new Library();

        // Creating instances of Book
        Book book1 = new Book("The Lord of the Rings", "J. R. R. Tolkien", "9780618645676", 1954);
        Book book2 = new Book("Harry Potter", "J. K. Rowling", "9780747532743", 1997);

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);

        // Displaying the list of available books in the library
        library.displayBooks();

        // Creating an instance of the Patron class
        Patron patron = new Patron("John Doe", "P001");
        // Registering the patron with the library
        library.registerPatron(patron);

        // Lending books to the patron
        library.lendBook(patron, book1);
        library.lendBook(patron, book2);

        // Displaying the updated list of available books in the library
        library.displayBooks();
    }
}
