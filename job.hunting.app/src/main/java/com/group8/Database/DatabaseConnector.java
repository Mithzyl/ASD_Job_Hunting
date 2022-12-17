package com.group8.Database;

public class DatabaseConnector {
    private String connection;

    private String url;

    private String loginUser;

    private String loginPassword;

    public void createSqlStatement(String statement){}

    public void getConnection(String userName, String password){}

    public void closeConnection(String userName, String password){}

    public void executeSqlStatement(String statement){}

    public void commit(){}

    public void rollback(){}


    // constructor
    public DatabaseConnector(String connection, String url, String loginUser, String loginPassword) {
        this.connection = connection;
        this.url = url;
        this.loginUser = loginUser;
        this.loginPassword = loginPassword;
    }
}
