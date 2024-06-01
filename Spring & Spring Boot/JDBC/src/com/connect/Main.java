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
//        db.InsertData(con);
    }
}
