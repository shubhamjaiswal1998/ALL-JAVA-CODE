//package com.apps;

import java.sql.*;
import java.util.Scanner;

public class insertsql_data2 {

	public static void main(String[] args)throws SQLException, ClassNotFoundException  {
		
		Connection connection=null;
		Statement stetement=null;
	
		
	    //1. load register
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("driver loaded sucessfully");
		 
		 //2. make connection /////////////////////////////////////////////////////
		    String url ="jdbc:mysql://localhost:3306/wscube";
		    String username ="root";
		    String password ="Shubham1998@";
		    connection= DriverManager.getConnection(url,username, password);
		    System.out.println("connection establish sucessfully");
		    System.out.println("implement class name is "+connection.getClass().getName());
		    
		 // 3.create statement object & sent query for set value //////////////////////
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter id ");
		   int id=sc.nextInt();
		   System.out.println("enter name ");
		    String name=sc.next();
		     // name="'"+name+"'";
		    System.out.println("enter email ");
		    String email=sc.next();
		       // email="'"+email+"'";
		    System.out.println("enter age ");
		    int age=sc.nextInt();
		    System.out.println("enter status ");
		    int status=sc.nextInt();
		    stetement =connection.createStatement();
//String sqlSelectQuery= "insert into wscube.wsuser(`id`,`name`,`email`,`age`,`status`)values("+id+","+name+","+email+","+age+","+status+")";
    
String sqlSelectQuery= 
    String.format("insert into wscube.wsuser(`id`,`name`,`email`,`age`,`status`)values(%d,'%s','%s',%d,%d)",
		id,name,email,age,status);
    System.out.println(sqlSelectQuery);
	int rowaffected=stetement.executeUpdate(sqlSelectQuery);
	System.out.println("no of row affected "+rowaffected);
		
		//4. close resource;////////////////////////////////////////////////////
			connection.close();
			stetement.close();
			sc.close();
			}

}
