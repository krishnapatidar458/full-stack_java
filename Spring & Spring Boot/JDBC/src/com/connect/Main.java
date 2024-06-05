package com.connect;

import java.sql.Connection;
//import java.util.Scanner;
public class Main {
    public static void main(String a[]){
//        Scanner sc = new Scanner(System.in);
        ConnectDB db = new ConnectDB();
        Connection con = db.DBcheck("library management system","postgres","458336");
//        db.createTable(con);
//        db.UpdateConstraints(con);
//        db.InsertData(con,"0101IT233D04",5754,"2024-06-15");
        db.Retrive(con,"booktransections");
    }
}
