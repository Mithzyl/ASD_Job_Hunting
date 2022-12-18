package com.group8.Database;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static Database single_instance = null;

    private List<String> tableNames;

    public void persist(){
        System.out.println("persist()");

    }

    public void makeConnection(String userName, String password){
        System.out.println("makeConnection()");

    }

    public void fetch(){
        System.out.println("fetch()");

    }

    public void update(){
        System.out.println("update()");

    }

    public void delete(){
        System.out.println("delete()");

    }


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
