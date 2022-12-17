package com.group8.Login;

import java.util.List;

public class Authenticator {
    private List<String> userName;

    private List<String> password;

    private List<String> role;

    private List<String> token;

    public Boolean login(){return null;}

    public void createAccount(){}

    public void resetPassword(){}

    public void getRoleOfUser(String user){}

    public void validateToken(String token){}

    public Boolean logout(){return null;}

    public Authenticator(List<String> userName, List<String> password, List<String> role, List<String> token) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.token = token;
    }

    // constructor
    public Authenticator() {
    }
}
