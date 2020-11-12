package com.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String emailId;
    private String password;
    private String fullName;

    public User() {
    }

    public User(long userId, String emailId, String password, String fullName) {
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.fullName = fullName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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
