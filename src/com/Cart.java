package com;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // Properties
    private int cartID;
    private List<Book> items;

    // Constructor
    public Cart(int cartID) {
        this.cartID = cartID;
        this.items = new ArrayList<>();
    }

    // Method to add an item (book) to the cart
    public void addItem(Book book) {
        items.add(book);
        System.out.println(book.getTitle() + " added to the cart.");
    }

    // Method to remove an item (book) from the cart
    public void removeItem(Book book) {
        items.remove(book);
        System.out.println(book.getTitle() + " removed from the cart.");
    }

    // Method to calculate the total amount of the cart
    public double calculateTotalAmount() {
        double totalAmount = 0.0;
        for (Book book : items) {
            totalAmount += book.getPrice();
        }
        return totalAmount;
    }

    // Method to display cart contents
    public void displayCartContents() {
        System.out.println("Cart ID: " + cartID);
        System.out.println("Cart Contents:");
        for (Book book : items) {
            System.out.println("- " + book.getTitle());
        }
        System.out.println("Total Amount: $" + calculateTotalAmount());
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create a Cart object (Assuming cartID 5001)
        Cart cart = new Cart(5001);

        // Create Book objects
        Book book1 = new Book(2001, "The Great Gatsby", "F. Scott Fitzgerald", 15.99, "Scribner");
        Book book2 = new Book(2002, "To Kill a Mockingbird", "Harper Lee", 12.49, "J. B. Lippincott & Co.");

        // Add items to the cart
        cart.addItem(book1);
        cart.addItem(book2);

        // Display cart contents and total amount
        cart.displayCartContents();

        // Remove an item from the cart
        cart.removeItem(book1);

        // Display updated cart contents and total amount
        cart.displayCartContents();
    }
}
