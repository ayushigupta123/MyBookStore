package com;

public class Payment {
    // Properties
    private int paymentID;
    private double amount;
    private String paymentStatus;

    // Constructor
    public Payment(int paymentID, double amount) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.paymentStatus = "Pending"; // Default payment status is set to "Pending" when the payment is created
    }

    // Getters and Setters
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    // Method to process the payment
    public void processPayment() {
        // Code to process the payment and update the payment status
        this.paymentStatus = "Paid";
        System.out.println("Payment processed successfully!");
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create a Payment object (Assuming paymentID 4001 and amount 50.99)
        Payment payment = new Payment(4001, 50.99);

        // Display payment details
        System.out.println("Payment ID: " + payment.getPaymentID());
        System.out.println("Amount: $" + payment.getAmount());
        System.out.println("Payment Status: " + payment.getPaymentStatus());

        // Process the payment
        payment.processPayment();

        // Display updated payment details
        System.out.println("Updated Payment Status: " + payment.getPaymentStatus());
    }
}

