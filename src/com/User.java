package com;

public class User {
    // Properties
    private int userID;
    private String username;
    private String password;
    private boolean isAdministrator;
    private boolean membershipStatus;

    // Constructor
    public User(int userID, String username, String password, boolean isAdministrator) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.isAdministrator = isAdministrator;
        this.membershipStatus = true; // Assuming all new users have active membership by default
    }

    // Getters and Setters
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrator() {
        return isAdministrator;
    }

    public void setAdministrator(boolean administrator) {
        isAdministrator = administrator;
    }

    public boolean isMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(boolean membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    // Method to register a new user
    public void registerUser() {
        // Code to register a new user and store user data in the database
        System.out.println("User registered successfully!");
    }

    // Method to authenticate user login
    public boolean loginUser(String enteredPassword) {
        // Code to authenticate user login by comparing the entered password with the actual password
        return this.password.equals(enteredPassword);
    }

    // Method to renew user membership upon request
    public void renewMembership() {
        // Code to renew user membership upon request
        this.membershipStatus = true; // Assuming membership is renewed successfully
        System.out.println("Membership renewed successfully!");
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Create a User object (Assuming userID 1001, username "john_doe", password "password123", and regular user)
        User user = new User(1001, "john_doe", "password123", false);

        // Display user information
        System.out.println("User ID: " + user.getUserID());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Is Administrator: " + user.isAdministrator());
        System.out.println("Membership Status: " + user.isMembershipStatus());

        // Register the user
        user.registerUser();

        // Authenticate user login
        String enteredPassword = "password123";
        boolean isAuthenticated = user.loginUser(enteredPassword);
        if (isAuthenticated) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials. Login failed!");
        }

        // Renew user membership
        user.renewMembership();
    }
}

