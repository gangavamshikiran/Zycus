package com.model;

import java.util.Objects;


public class User {
    private int userId;
    private String emailId;
    private String password;
    private String fullName;

    public User() {
    }

    public User(int userId, String emailId, String password, String fullName) {
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.fullName = fullName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId &&
                emailId.equals(user.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, emailId);
    }

    @Override
    public String toString() {
        return userId+"\t"+emailId+"\t"+password+"\t"+fullName+"\n";
    }
}
