package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        this.books = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Library books:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                    ", ISBN: " + book.getISBN() + ", Year: " + book.getYear() +
                    ", Borrowed: " + (book.isBorrowed() ? "Yes" : "No"));
        }
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void lendBook(Patron patron, Book book) {
        if (books.contains(book) && !book.isBorrowed()) {
            patron.borrowBook(book);
            System.out.println("Book lent to patron: " + patron.getName());
        } else {
            System.out.println("Book not available for lending.");
        }
    }

    public void returnBook(Patron patron, Book book) {
        if (books.contains(book) && patron.getBorrowedBooks().contains(book)) {
            patron.returnBook(book);
            System.out.println("Book returned by patron: " + patron.getName());
        } else {
            System.out.println("Patron did not borrow this book.");
        }
    }
}
