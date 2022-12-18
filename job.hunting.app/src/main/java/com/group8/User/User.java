package com.group8.User;

public class User {

    private Integer id;
    private String userName;

    private String password;

    private Boolean status;

    private String email;

    public User() {
    }

    public User(String userName, String password, Boolean status, String email) {
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.email = email;
    }

    public String writeReview() {
//get input from user
        return null;
    }

    // TODO: review parameter
    public String updateReview() {
//get updated review from user

        return null;
    }

    public String updateProfile() {
        return null;
    }

    // Getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
