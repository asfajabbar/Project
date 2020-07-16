package com.example.project;
public class Users {
    public String username;

    public Users() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public String getUsername() {
        return username;
    }

    public Users(String username) {
        this.username = username;
    }
}
