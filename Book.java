package org.example;

import lombok.Getter;

public class Book {
    @Getter
    private String title;
    @Getter
    private String author;
    @Getter
    private String ISBN;
    @Getter
    private int year;
    private boolean isBorrowed;

    public Book(String title, String author, String ISBN, int year) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.year = year;
    }

    public void borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }
}
