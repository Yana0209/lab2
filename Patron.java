package org.example;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String ID;
    private List<Book> borrowedBooks;

    public Patron(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        book.borrow();
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        book.returnBook();
        borrowedBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}
