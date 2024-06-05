package com.connect;

//import javax.swing.plaf.nimbus.State;
import java.sql.*;
//import java.util.Date;


public class ConnectDB {
    public Connection DBcheck(String DBname,String username,String password)
    {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+DBname, username,password);

            if (conn != null) {
                System.out.println("connect successfully");
            }
            else{
                System.out.println("connecting failed");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return conn;
    }
    public void createTable(Connection conn){
        Statement st;
        try{
//            String query = "Create Table student (rollno varchar(12),s_name varchar(100),s_branch varchar(3),s_city varchar(20),s_contact_no varchar(10),primary key(rollno));";
//            String query1 = "Create Table branch (branch_Id varchar(3),branch_name varchar(100),primary key(branch_Id));";
//            String query2 = "Create Table books (book_Id int primary key,title varchar(80),b_auther varchar(100),b_publisher varchar(100));";
//            String query3 = "Create Table booktransections (book_transectionId SERIAL primary key,rollno varchar(12),book_Id int,issue_date timestamp,return_date date,Foreign key (rollno) references student(rollno),Foreign key (book_Id) references books(book_Id));";
            st = conn.createStatement();

//            st.executeUpdate(query);
//            st.executeUpdate(query1);
//            st.executeUpdate(query2);
//            st.executeUpdate(query3);
            System.out.println("Table created");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public void UpdateConstraints(Connection conn){
        try{
            Statement st = conn.createStatement();
            String update = "Alter Table student Add constraint s_branch foreign key (branch_id) references branch(branch_id);";
            st.executeUpdate(update);
            System.out.println("update Success");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void InsertData(Connection conn,String roll,int b_id, String date){
        try{
            Statement st = conn.createStatement();
            String query =String.format("insert into booktransections(rollno,book_id,return_date) values ('%s',%d,'%s');",roll,b_id,date);
            st.executeUpdate(query);
            System.out.println("data inserted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void Retrive(Connection conn,String tbl_name){
        try{
            Statement st = conn.createStatement();
            String Query = String.format("select * from %s ",tbl_name);
            ResultSet rt = st.executeQuery(Query);
            while(rt.next()){
                System.out.print(rt.getString("book_transectionid")+" ");
                System.out.print(rt.getString("rollno")+" -> ");
                System.out.print(rt.getString("book_id")+" -> ");
                System.out.print(rt.getString("issue_date")+" -> ");
                System.out.println(rt.getString("return_date")+" ");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}