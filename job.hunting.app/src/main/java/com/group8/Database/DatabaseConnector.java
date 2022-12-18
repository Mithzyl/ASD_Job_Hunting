package com.group8.Database;

public class DatabaseConnector {
    private String connection;

    private String url;

    private String loginUser;

    private String loginPassword;

    public void createSqlStatement(String statement){
        System.out.println("createSqlStatement()");

    }

    public void getConnection(String userName, String password){
        System.out.println("getConnection()");

    }

    public void closeConnection(String userName, String password){
        System.out.println("closeConnection()");

    }

    public void executeSqlStatement(String statement){
        System.out.println("executeSqlStatement()");

    }

    public void commit(){
        System.out.println("commit()");

    }

    public void rollback(){
        System.out.println("rollback()");

    }


    // constructor
    public DatabaseConnector(String connection, String url, String loginUser, String loginPassword) {
        this.connection = connection;
        this.url = url;
        this.loginUser = loginUser;
        this.loginPassword = loginPassword;
    }
}
