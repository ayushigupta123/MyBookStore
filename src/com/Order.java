package com;

import java.util.ArrayList;
import java.util.List;

public class Order {
    // Properties
    private int orderID;
    private List<Book> orderedBooks;
    private String orderStatus;
    private String paymentStatus;

    // Constructor
    public Order(int orderID) {
        this.orderID = orderID;
        this.orderedBooks = new ArrayList<>();
        this.orderStatus = "Pending"; // Default order status is set to "Pending" when the order is created
        this.paymentStatus = "Unpaid"; // Default payment status is set to "Unpaid" when the order is created
    }

    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public List<Book> getOrderedBooks() {
        return orderedBooks;
    }

    public void setOrderedBooks(List<Book> orderedBooks) {
        this.orderedBooks = orderedBooks;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // Method to add a book to the order
    public void addBookToOrder(Book book) {
        orderedBooks.add(book);
        System.out.println(book.getTitle() + " added to the order.");
    }

    // Method to remove a book from the order
    public void removeBookFromOrder(Book book) {
        orderedBooks.remove(book);
        System.out.println(book.getTitle() + " removed from the order.");
    }

    // Method to process the payment for the order
    public void processPayment() {
        // Code to process the payment and update the payment status
        this.paymentStatus = "Paid";
        System.out.println("Payment processed successfully!");
    }

    // Method to update the order status
    public void updateOrderStatus(String newStatus) {
        this.orderStatus = newStatus;
        System.out.println("Order status updated to: " + newStatus);
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create an Order object (Assuming orderID 3001)
        Order order = new Order(3001);

        // Create Book objects
        Book book1 = new Book(1001, "The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Scribner");
        Book book2 = new Book(1002, "To Kill a Mockingbird", "Harper Lee", 12.49, "J. B. Lippincott & Co.");

        // Add books to the order
        order.addBookToOrder(book1);
        order.addBookToOrder(book2);

        // Display order details
        System.out.println("Order ID: " + order.getOrderID());
        System.out.println("Order Status: " + order.getOrderStatus());
        System.out.println("Payment Status: " + order.getPaymentStatus());
        System.out.println("Ordered Books: ");
        for (Book book : order.getOrderedBooks()) {
            System.out.println("- " + book.getTitle());
        }

        // Process the payment for the order
        order.processPayment();

        // Update the order status
        order.updateOrderStatus("Shipped");
    }
}

