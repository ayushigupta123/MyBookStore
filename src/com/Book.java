package com;

public class Book {
    // Properties
    private int bookID;
    private String title;
    private String author;
    private double price;
    private String publisher;

    // Constructor
    public Book(int bookID, String title, String author, double price, String publisher) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    // Getters and Setters
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Method to add a new book
    public void addBook() {
        // Code to add a new book to the database
        System.out.println("Book added successfully!");
    }

    // Method to remove a book
    public void removeBook() {
        // Code to remove a book from the database
        System.out.println("Book removed successfully!");
    }

    // Method to update book details
    public void updateBook() {
        // Code to update book details in the database
        System.out.println("Book details updated successfully!");
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create a Book object (Assuming bookID 2001, title "The Great Gatsby", author "F. Scott Fitzgerald", price 15.99, publisher "Scribner")
        Book book = new Book(2001, "The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Scribner");

        // Display book information
        System.out.println("Book ID: " + book.getBookID());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Price: $" + book.getPrice());
        System.out.println("Publisher: " + book.getPublisher());

        // Add the book
        book.addBook();

        // Update the book details
        book.setPrice(17.49);
        book.updateBook();
    }
}

