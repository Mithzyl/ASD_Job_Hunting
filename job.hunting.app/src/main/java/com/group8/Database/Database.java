package com.group8.Database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database single_instance = null;

    private List<String> tableNames;

    public void persist(){}

    public void makeConnection(String userName, String password){}

    public void fetch(){}

    public void update(){}

    public void delete(){}


    private Database() {
        List<String> tableNames= new ArrayList<>();
        this.tableNames = tableNames;
    }
    public static Database getInstance() {
        if (single_instance == null)
            single_instance = new Database();
        return single_instance;
    }
}
