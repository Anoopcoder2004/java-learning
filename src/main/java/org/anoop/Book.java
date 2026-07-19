package org.anoop;

public class Book {

    // Properties of a book
    private String title;
    private String author;
    private boolean available;
    private int pages;

    // Constructor runs automatically when a Book object is created
    // Used to initialize the object with values
    public Book(String title, String author, boolean available, int pages) {

        // 'this' refers to the current object
        this.title = title;
        this.author = author;
        this.available = available;
        this.pages = pages;
    }

    // Displays book details
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
        System.out.println("Pages: " + pages);
    }

    // Borrow the book if available
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book already borrowed");
        }
    }

    // Mark the book as returned
    void returnBook() {
        available = true;
    }
}
